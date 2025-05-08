package eu.dunedle.dunedleserver.domain;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DuneCharacter {
	
	@Id 
	@Builder.Default
	UUID id = UUID.randomUUID();
	
	String name; 
	
	@ElementCollection(targetClass = Gender.class)
	@Enumerated(EnumType.STRING) 
	@JoinTable(name = "character_gender", joinColumns = @JoinColumn(name = "character_id"))
	@Column(name = "gender")
	List<Gender> genders; 
	
	Integer height;
	
	@ElementCollection(targetClass = Faction.class) 
	@Enumerated(EnumType.STRING)
	@JoinTable(name = "character_faction", joinColumns = @JoinColumn(name = "character_id")) 
	@Column(name = "faction")
	List<Faction> factions; 
	
	@ElementCollection(targetClass = HairColor.class) 
	@Enumerated(EnumType.STRING) 
	@JoinTable(name = "character_hair_color", joinColumns = @JoinColumn(name = "character_id")) 
	@Column(name = "hair_color")
	List<HairColor> hairColors; 
	
	@ElementCollection(targetClass = Book.class) 
	@Enumerated(EnumType.STRING) 
	@JoinTable(name = "character_book", joinColumns = @JoinColumn(name = "character_id")) 
	@Column(name = "book")
	List<Book> books; 
}