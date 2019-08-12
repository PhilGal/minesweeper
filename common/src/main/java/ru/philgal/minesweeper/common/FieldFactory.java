package ru.philgal.minesweeper.common;

import java.util.Map;
import java.util.function.Supplier;

public class FieldFactory implements Factory<Field> {

    private GameDifficulty difficulty;

    private static final Map<GameDifficulty, Supplier<Field>> FACTORY_MAP = Map.of(
            GameDifficulty.BEGINNER, SmallField::new,
            GameDifficulty.INTERMEDIATE, MediumField::new,
            GameDifficulty.EXPERT, LargeField::new
    );

    FieldFactory(GameDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public Field create() {
        return FACTORY_MAP.getOrDefault(difficulty, () -> {
            throw new IllegalArgumentException("Unknown game difficulty");
        }).get();
    }
}
