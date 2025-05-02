package de.moeri.dunedleserver.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import de.moeri.dunedleserver.domain.Book;
import de.moeri.dunedleserver.domain.DuneCharacter;
import de.moeri.dunedleserver.domain.Faction;
import de.moeri.dunedleserver.domain.Gender;
import de.moeri.dunedleserver.repository.DuneCharacterRepository;

@Component
public class DataInitializer implements ApplicationRunner {

    private final DuneCharacterRepository repo;

    public DataInitializer(DuneCharacterRepository repository) {
        this.repo = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
    	List<DuneCharacter> chars = new ArrayList<>();
    	chars.add(DuneCharacter.builder().name("Paul Atreides").gender(Gender.MALE).factions(List.of(Faction.ATREIDES, Faction.BENE_GESSERITH, Faction.FREMEN, Faction.MENTAT)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Leto I Atreides").gender(Gender.MALE).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Lady Jessica").gender(Gender.FEMALE).factions(List.of(Faction.ATREIDES, Faction.BENE_GESSERITH)).books(List.of(Book.DUNE, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Vladimir Harkonnen").gender(Gender.MALE).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Chani").gender(Gender.FEMALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Stilgar").gender(Gender.MALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Duncan Idaho").gender(Gender.MALE).factions(List.of(Faction.MENTAT)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Wellington Yueh").gender(Gender.MALE).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Gurney Halleck").gender(Gender.MALE).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Feyd-Rautha Harkonnen").gender(Gender.MALE).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Glossu Rabban Harkonnen").gender(Gender.MALE).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Gaius Helen Mohiam").gender(Gender.FEMALE).factions(List.of(Faction.BENE_GESSERITH)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Princess Irulan").gender(Gender.FEMALE).factions(List.of(Faction.CORRINO, Faction.BENE_GESSERITH)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Shaddam IV Corrino").gender(Gender.MALE).factions(List.of(Faction.CORRINO)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Thufir Hawat").gender(Gender.MALE).factions(List.of(Faction.MENTAT)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Count Hasimir Fenring").gender(Gender.MALE).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Margot Fenring").gender(Gender.FEMALE).factions(List.of(Faction.HARKONNEN, Faction.BENE_GESSERITH)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Piter De Vries").gender(Gender.MALE).factions(List.of(Faction.MENTAT)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Alia Atreides").gender(Gender.FEMALE).factions(List.of(Faction.ATREIDES, Faction.BENE_GESSERITH)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Shadout Mapes").gender(Gender.FEMALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Liet-Kynes").gender(Gender.MALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Ramallo").gender(Gender.FEMALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Jamis").gender(Gender.MALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Harah").gender(Gender.FEMALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Otheym").gender(Gender.MALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Korba").gender(Gender.MALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Captain Aramsham").gender(Gender.MALE).factions(List.of(Faction.CORRINO)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Iakin Nefud").gender(Gender.MALE).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		
		chars.add(DuneCharacter.builder().name("Scytale").gender(Gender.MALE).factions(List.of(Faction.TLEILAX)).books(List.of(Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Edric").gender(Gender.MALE).factions(List.of(Faction.NONE)).books(List.of(Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Bijaz").gender(Gender.MALE).factions(List.of(Faction.TLEILAX)).books(List.of(Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Lichna").gender(Gender.FEMALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Farok").gender(Gender.MALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE_MESSIAH)).build());

		chars.add(DuneCharacter.builder().name("Princess Wensicia").gender(Gender.FEMALE).factions(List.of(Faction.CORRINO)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Leto II Atreides").gender(Gender.OTHER).factions(List.of(Faction.ATREIDES, Faction.FREMEN, Faction.BENE_GESSERITH)).books(List.of(Book.CHILDREN_OF_DUNE, Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Ghanima Atreides").gender(Gender.FEMALE).factions(List.of(Faction.ATREIDES, Faction.FREMEN, Faction.BENE_GESSERITH)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Tyekanik").gender(Gender.MALE).factions(List.of(Faction.CORRINO)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Farad'n (Harq al'Ada)").gender(Gender.MALE).factions(List.of(Faction.CORRINO, Faction.BENE_GESSERITH)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Javid").gender(Gender.MALE).factions(List.of(Faction.FREMEN)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		
		chars.add(DuneCharacter.builder().name("Siona Atreides").gender(Gender.FEMALE).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Hwi Noree").gender(Gender.FEMALE).factions(List.of(Faction.IX)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Anteac").gender(Gender.FEMALE).factions(List.of(Faction.BENE_GESSERITH)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Moneo Atreides").gender(Gender.MALE).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Nayla").gender(Gender.FEMALE).factions(List.of(Faction.NONE)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Chenoeh").gender(Gender.FEMALE).factions(List.of(Faction.BENE_GESSERITH)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Malky").gender(Gender.MALE).factions(List.of(Faction.IX)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Luyseyal").gender(Gender.FEMALE).factions(List.of(Faction.BENE_GESSERITH)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		repo.saveAll(chars);
    }
}
