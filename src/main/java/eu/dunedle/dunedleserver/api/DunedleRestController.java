package eu.dunedle.dunedleserver.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.dunedle.dunedleserver.domain.DuneCharacter;
import eu.dunedle.dunedleserver.domain.GuessResponse;
import eu.dunedle.dunedleserver.logic.DunedleService;

@RestController
public class DunedleRestController {
	@Autowired
	private DunedleService dunedleService;
	
	@GetMapping("/")
	public List<DuneCharacter> root() {
		return findAll();
	}
	
	@GetMapping("/dune-character")
	public List<DuneCharacter> findAll() {
		return dunedleService.getAll();
	}
	
	@GetMapping("/dune-character/search-by-name")
	public List<DuneCharacter> findCharactersByNameSearchInput(@RequestParam(value = "input") String searchInput) {
		return dunedleService.getCharactersByName(searchInput);
	}
	
	@GetMapping("/dune-character/yesterday")
	public DuneCharacter getYesterdaysCharacter() {
		return dunedleService.getYesterdaysCharacter();
	}
	
	@GetMapping("/guess")
	public GuessResponse guessCharacter(@RequestParam(value = "character") UUID guessedCharacterId) {
		return dunedleService.createGuessReponse(guessedCharacterId);
	}
}
