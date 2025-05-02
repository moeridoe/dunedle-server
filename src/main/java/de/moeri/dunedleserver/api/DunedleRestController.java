package de.moeri.dunedleserver.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.moeri.dunedleserver.domain.DuneCharacter;
import de.moeri.dunedleserver.domain.GuessResponse;
import de.moeri.dunedleserver.logic.DunedleService;

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
	
	@GetMapping("/guess")
	public GuessResponse guessCharacter(@RequestParam(value = "character") UUID guessedCharacterId) {
		return dunedleService.createGuessReponse(guessedCharacterId);
	}
}
