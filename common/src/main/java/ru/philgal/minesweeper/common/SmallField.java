package ru.philgal.minesweeper.common;

import java.util.List;

public class SmallField implements Field {

    private List<Cell> cells;

    @Override
    public int fieldSize() {
        return 9;
    }

    @Override
    public int minesCount() {
        return 10;
    }

    @Override
    public List<Cell> getCells() {
		return cells;
	}
}
