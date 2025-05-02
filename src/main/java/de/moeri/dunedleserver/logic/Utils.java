package de.moeri.dunedleserver.logic;

import java.time.LocalDate;
import java.util.List;

public class Utils {

	
	static long getSeedOfDay() {
		return LocalDate.now().toEpochDay();
	}
	
	static <T> int compareObject(T target, T guess) {
		if (target.equals(guess)) return 1;
		else return 0;
	}
	
	static <T> int compareLists(List<T> targetList, List<T> guessedList) {
		if((targetList.containsAll(guessedList) && guessedList.containsAll(targetList)) 
		|| (targetList.isEmpty() && guessedList.isEmpty())) {
			return 1;
		}

		for(T elem : guessedList) {
			if(targetList.contains(elem)) {
				return 2;
			}
		}
		
		return 0;
	}
}
