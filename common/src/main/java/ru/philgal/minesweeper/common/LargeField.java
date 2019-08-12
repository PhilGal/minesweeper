package ru.philgal.minesweeper.common;

import java.util.List;

public class LargeField implements Field {

    private List<Cell> cells;

    @Override
    public int fieldSize() {
        return 24;
    }

    @Override
    public int minesCount() {
        return 99;
    }

    @Override
    public List<Cell> getCells() {
		return cells;
	}
}
