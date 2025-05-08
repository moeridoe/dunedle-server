package eu.dunedle.dunedleserver.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import eu.dunedle.dunedleserver.domain.Book;
import eu.dunedle.dunedleserver.domain.DuneCharacter;
import eu.dunedle.dunedleserver.domain.Faction;
import eu.dunedle.dunedleserver.domain.Gender;
import eu.dunedle.dunedleserver.domain.HairColor;
import eu.dunedle.dunedleserver.repository.DuneCharacterRepository;

@Component
public class DataInitializer implements ApplicationRunner {

    private final DuneCharacterRepository repo;

    public DataInitializer(DuneCharacterRepository repository) {
        this.repo = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
    	List<DuneCharacter> chars = new ArrayList<>();
    	chars.add(DuneCharacter.builder().name("Paul Atreides (Muad'Dib, Prophet)").genders(List.of(Gender.MALE)).height(180).hairColors(List.of(HairColor.DARK_BROWN)).factions(List.of(Faction.ATREIDES, Faction.BENE_GESSERITH, Faction.FREMEN, Faction.MENTAT)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Leto I Atreides").genders(List.of(Gender.MALE)).height(188).hairColors(List.of(HairColor.DARK_BROWN)).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Lady Jessica").genders(List.of(Gender.FEMALE)).height(175).hairColors(List.of(HairColor.AUBURN)).factions(List.of(Faction.ATREIDES, Faction.BENE_GESSERITH)).books(List.of(Book.DUNE, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Vladimir Harkonnen").genders(List.of(Gender.MALE)).height(193).hairColors(List.of(HairColor.RED, HairColor.NONE)).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Chani").genders(List.of(Gender.FEMALE)).height(165).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Stilgar").genders(List.of(Gender.MALE)).height(183).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Duncan Idaho (Hayt)").genders(List.of(Gender.MALE)).height(185).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.MENTAT)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Dr. Wellington Yueh").genders(List.of(Gender.MALE)).height(175).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Gurney Halleck").genders(List.of(Gender.MALE)).height(175).hairColors(List.of(HairColor.BLACK, HairColor.GREY)).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Feyd-Rautha Harkonnen").genders(List.of(Gender.MALE)).height(183).hairColors(List.of(HairColor.DARK_BROWN, HairColor.NONE)).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Glossu Rabban Harkonnen").genders(List.of(Gender.MALE)).height(195).hairColors(List.of(HairColor.DARK_BROWN, HairColor.NONE)).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Gaius Helen Mohiam").genders(List.of(Gender.FEMALE)).height(170).hairColors(List.of(HairColor.GREY)).factions(List.of(Faction.BENE_GESSERITH)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Princess Irulan").genders(List.of(Gender.FEMALE)).height(175).hairColors(List.of(HairColor.BLOND)).factions(List.of(Faction.CORRINO, Faction.BENE_GESSERITH)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Shaddam IV Corrino").genders(List.of(Gender.MALE)).height(175).hairColors(List.of(HairColor.BLOND)).factions(List.of(Faction.CORRINO)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Thufir Hawat").genders(List.of(Gender.MALE)).height(175).hairColors(List.of(HairColor.GREY)).factions(List.of(Faction.MENTAT)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Count Hasimir Fenring").genders(List.of(Gender.MALE)).height(170).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Margot Fenring").genders(List.of(Gender.FEMALE)).height(170).hairColors(List.of(HairColor.BLOND)).factions(List.of(Faction.HARKONNEN, Faction.BENE_GESSERITH)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Piter De Vries").genders(List.of(Gender.MALE)).height(180).hairColors(List.of(HairColor.NONE)).factions(List.of(Faction.MENTAT)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Alia Atreides").genders(List.of(Gender.FEMALE)).height(170).hairColors(List.of(HairColor.AUBURN)).factions(List.of(Faction.ATREIDES, Faction.BENE_GESSERITH)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Shadout Mapes").genders(List.of(Gender.FEMALE)).height(160).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Liet-Kynes").genders(List.of(Gender.MALE)).height(180).hairColors(List.of(HairColor.GREY)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Ramallo").genders(List.of(Gender.FEMALE)).height(160).hairColors(List.of(HairColor.GREY, HairColor.NONE)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Jamis").genders(List.of(Gender.MALE)).height(178).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Harah").genders(List.of(Gender.FEMALE)).height(165).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Otheym").genders(List.of(Gender.MALE)).height(170).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Korba").genders(List.of(Gender.MALE)).height(175).hairColors(List.of(HairColor.NONE)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE, Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Captain Aramsham").genders(List.of(Gender.MALE)).height(178).hairColors(List.of(HairColor.UNSPECIFIED)).factions(List.of(Faction.CORRINO)).books(List.of(Book.DUNE)).build());
		chars.add(DuneCharacter.builder().name("Iakin Nefud").genders(List.of(Gender.MALE)).height(180).hairColors(List.of(HairColor.RED)).factions(List.of(Faction.HARKONNEN)).books(List.of(Book.DUNE)).build());
		
		chars.add(DuneCharacter.builder().name("Scytale").genders(List.of(Gender.MALE)).height(0).hairColors(List.of(HairColor.VARIABLE)).factions(List.of(Faction.TLEILAX)).books(List.of(Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Edric").genders(List.of(Gender.MALE)).height(180).hairColors(List.of(HairColor.NONE)).factions(List.of(Faction.NONE)).books(List.of(Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Bijaz").genders(List.of(Gender.MALE)).height(120).hairColors(List.of(HairColor.UNSPECIFIED)).factions(List.of(Faction.TLEILAX)).books(List.of(Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Lichna").genders(List.of(Gender.FEMALE)).height(165).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE_MESSIAH)).build());
		chars.add(DuneCharacter.builder().name("Farok").genders(List.of(Gender.MALE)).height(170).hairColors(List.of(HairColor.UNSPECIFIED)).factions(List.of(Faction.FREMEN)).books(List.of(Book.DUNE_MESSIAH)).build());

		chars.add(DuneCharacter.builder().name("Princess Wensicia").genders(List.of(Gender.FEMALE)).height(172).hairColors(List.of(HairColor.BLOND)).factions(List.of(Faction.CORRINO)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Leto II Atreides").genders(List.of(Gender.MALE, Gender.OTHER)).height(700).hairColors(List.of(HairColor.DARK_BROWN, HairColor.NONE)).factions(List.of(Faction.ATREIDES, Faction.FREMEN, Faction.BENE_GESSERITH)).books(List.of(Book.CHILDREN_OF_DUNE, Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Ghanima Atreides").genders(List.of(Gender.FEMALE)).height(165).hairColors(List.of(HairColor.AUBURN)).factions(List.of(Faction.ATREIDES, Faction.FREMEN, Faction.BENE_GESSERITH)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Tyekanik").genders(List.of(Gender.MALE)).height(178).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.CORRINO)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Farad'n (Harq al'Ada)").genders(List.of(Gender.MALE)).height(180).hairColors(List.of(HairColor.BLOND)).factions(List.of(Faction.CORRINO, Faction.BENE_GESSERITH)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		chars.add(DuneCharacter.builder().name("Javid").genders(List.of(Gender.MALE)).height(180).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.FREMEN)).books(List.of(Book.CHILDREN_OF_DUNE)).build());
		
		chars.add(DuneCharacter.builder().name("Siona Atreides").genders(List.of(Gender.FEMALE)).height(170).hairColors(List.of(HairColor.DARK_BROWN)).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Hwi Noree").genders(List.of(Gender.FEMALE)).height(170).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.IX)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Anteac").genders(List.of(Gender.FEMALE)).height(170).hairColors(List.of(HairColor.UNSPECIFIED)).factions(List.of(Faction.BENE_GESSERITH, Faction.MENTAT)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Moneo Atreides").genders(List.of(Gender.MALE)).height(180).hairColors(List.of(HairColor.DARK_BROWN)).factions(List.of(Faction.ATREIDES)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Nayla").genders(List.of(Gender.FEMALE)).height(185).hairColors(List.of(HairColor.UNSPECIFIED)).factions(List.of(Faction.NONE)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Chenoeh").genders(List.of(Gender.FEMALE)).height(170).hairColors(List.of(HairColor.UNSPECIFIED)).factions(List.of(Faction.BENE_GESSERITH)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Malky").genders(List.of(Gender.MALE)).height(175).hairColors(List.of(HairColor.BLACK)).factions(List.of(Faction.IX)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		chars.add(DuneCharacter.builder().name("Luyseyal").genders(List.of(Gender.FEMALE)).height(170).hairColors(List.of(HairColor.UNSPECIFIED)).factions(List.of(Faction.BENE_GESSERITH)).books(List.of(Book.DUNE_GOD_EMPEROR)).build());
		repo.saveAll(chars);
    }
}
