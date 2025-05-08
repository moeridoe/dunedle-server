package eu.dunedle.dunedleserver.domain;

import java.util.Map;

public record GuessResponse(DuneCharacter guessedCharacter, Map<Category, Integer> guessEvaluation) {}
