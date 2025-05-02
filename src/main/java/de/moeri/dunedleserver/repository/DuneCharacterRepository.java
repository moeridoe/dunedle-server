package de.moeri.dunedleserver.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.moeri.dunedleserver.domain.DuneCharacter;

@Repository
public interface DuneCharacterRepository extends CrudRepository<DuneCharacter, UUID>{
	@Query(value = "select * from dune_character dc where dc.name like %?1%", nativeQuery = true)
	List<DuneCharacter> findByName(String searchInput);

	@Query(value = "select * from dune_character", nativeQuery = true)
	List<DuneCharacter> findAll();
}
