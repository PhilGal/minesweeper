package ru.philgal.minesweeper.common;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

import ru.philgal.minesweeper.common.Cell.Type;

import java.util.HashMap;

abstract class BaseField implements Field {

    private final int fieldSize;
    private final int minesCount;

    private List<Cell> cells;

    BaseField(int fieldSize, int minesCount) {
        this.fieldSize = fieldSize;
        this.minesCount = minesCount;
        generateCells();
    }

    @Override
    public int minesCount() {
        return minesCount;
    }

    @Override
    public int fieldSize() {
        return fieldSize;
    }

    @Override
    public List<Cell> getCells() {
        return cells;
    }

    private void generateCells() {
        
       //int[] xs 

        // Map<Position, Cell> positionedCells = new HashMap<>(fieldSize * fieldSize);
        // Random random = new Random();
        // for (int x = 0; x < fieldSize; x++) {
        // for (int y = 0; y < fieldSize; y++) {

        // int randomY = random.nextInt(fieldSize);
        // Cell cell = randomY == y ? new MineCell() : new EmptyCell();

        // positionedCells.put(new Position(x, y, fieldSize),
        // CellFactory.create(Type.EMPTY));
        // }
        // }
    }
}