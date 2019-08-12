package ru.philgal.minesweeper.common;

import ru.philgal.minesweeper.ArgFlags;

import java.util.Map;
import java.util.Objects;

public class ConsoleAppGameFactory implements Factory<Game> {

    private final GameDifficulty difficulty;

    private static final Map<String, GameDifficulty> DIFFICULTY_MAP = Map.of(
            ArgFlags.DIFFICULTY_BEGINNER, GameDifficulty.BEGINNER,
            ArgFlags.DIFFICULTY_INTERMEDIATE, GameDifficulty.INTERMEDIATE,
            ArgFlags.DIFFICULTY_EXPERT, GameDifficulty.EXPERT
    );

    public ConsoleAppGameFactory(String difficulty) {
        this.difficulty = parseFromString(difficulty);
    }

    @Override
    public Game create() {
        return new GameImpl(difficulty);
    }

    public GameDifficulty parseFromString(String difficulty) {
        Objects.requireNonNull(difficulty, "Difficulty must not be null");
        return DIFFICULTY_MAP.getOrDefault(difficulty, GameDifficulty.INTERMEDIATE);
    }
}
