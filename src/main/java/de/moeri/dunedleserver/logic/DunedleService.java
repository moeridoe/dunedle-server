package de.moeri.dunedleserver.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.moeri.dunedleserver.domain.Category;
import de.moeri.dunedleserver.domain.DuneCharacter;
import de.moeri.dunedleserver.domain.GuessResponse;
import de.moeri.dunedleserver.repository.DuneCharacterRepository;

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
		DuneCharacter target = getTargetCharacter();
		
		Map<Category, Integer> guessEvaluation = new HashMap<>();
		guessEvaluation.put(Category.GENDER, Utils.compareObject(target.getGender(), character.getGender()));
		guessEvaluation.put(Category.FACTION, Utils.compareLists(target.getFactions(), character.getFactions()));
		guessEvaluation.put(Category.BOOKS, Utils.compareLists(target.getBooks(), character.getBooks()));
		
		return guessEvaluation;
	}
	
	private DuneCharacter getTargetCharacter() {
		List<DuneCharacter> candidates = getAll();
		Random rnd = new Random(Utils.getSeedOfDay());
		return candidates.get(rnd.nextInt(0, candidates.size()));
	}
}
