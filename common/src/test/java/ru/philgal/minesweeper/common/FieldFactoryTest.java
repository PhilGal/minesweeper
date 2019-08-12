package ru.philgal.minesweeper.common;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FieldFactoryTest {

    @ParameterizedTest
    @CsvSource({
        "BEGINNER, 9, 10",
        "INTERMEDIATE, 16, 40",
        "EXPERT, 24, 99"
    })
    void shoulCreateFieldWithCorrectSizeAndMinesCount(GameDifficulty difficulty, int expectedFieldSize, int expectedMinesCount) {
        Field field = new FieldFactory(difficulty).create();
        Assertions.assertThat(field.fieldSize()).isEqualTo(expectedFieldSize);
        Assertions.assertThat(field.minesCount()).isEqualTo(expectedMinesCount);
    }

    @Test
    void shouldGenerateCells() {
        Field field = new FieldFactory(GameDifficulty.BEGINNER).create();
        List<Cell> cells = field.getCells();
        Assertions.assertThat(cells.size()).isEqualTo(field.fieldSize() * field.fieldSize());
    }
}