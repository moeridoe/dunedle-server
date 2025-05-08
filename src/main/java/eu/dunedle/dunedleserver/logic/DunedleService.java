package eu.dunedle.dunedleserver.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.dunedle.dunedleserver.domain.Category;
import eu.dunedle.dunedleserver.domain.DuneCharacter;
import eu.dunedle.dunedleserver.domain.GuessResponse;
import eu.dunedle.dunedleserver.repository.DuneCharacterRepository;

@Service
public class DunedleService {
	@Autowired
	private DuneCharacterRepository repository;
	
	public List<DuneCharacter> getAll() {
		return repository.findAll();
	}
	
	public List<DuneCharacter> getCharactersByName(String name) {
		return repository.findByName(name);
	}
	
	public DuneCharacter getById(UUID id) {
		Optional<DuneCharacter> character = repository.findById(id);
		return character.isPresent() ? character.get() : null;
	}
	
	public GuessResponse createGuessReponse(UUID characterId) {
		DuneCharacter character = this.getById(characterId);
		return new GuessResponse(character, this.evaluateGuess(character));
	}
	
	private Map<Category, Integer> evaluateGuess(DuneCharacter character) {
		DuneCharacter target = getTodaysTargetCharacter();
		
		Map<Category, Integer> guessEvaluation = new HashMap<>();
		guessEvaluation.put(Category.GENDER, Utils.compareLists(target.getGenders(), character.getGenders()));
		guessEvaluation.put(Category.HEIGHT, Utils.compareInteger(target.getHeight(), character.getHeight()));
		guessEvaluation.put(Category.HAIRCOLOR, Utils.compareLists(target.getHairColors(), character.getHairColors()));
		guessEvaluation.put(Category.FACTION, Utils.compareLists(target.getFactions(), character.getFactions()));
		guessEvaluation.put(Category.BOOKS, Utils.compareLists(target.getBooks(), character.getBooks()));
		
		return guessEvaluation;
	}
	
	private DuneCharacter getTodaysTargetCharacter() {
		List<DuneCharacter> candidates = getAll();
		Random rnd = new Random(Utils.getSeedOfToday());
		return candidates.get(rnd.nextInt(0, candidates.size()));
	}
	
	public DuneCharacter getYesterdaysCharacter() {
		List<DuneCharacter> candidates = getAll();
		Random rnd = new Random(Utils.getSeedOfYesterday());
		return candidates.get(rnd.nextInt(0, candidates.size()));
	}
}
