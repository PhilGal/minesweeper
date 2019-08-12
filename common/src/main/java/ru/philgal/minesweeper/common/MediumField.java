package ru.philgal.minesweeper.common;

import java.util.List;

public class MediumField implements Field {

    @Override
    public int fieldSize() {
        return 16;
    }

    @Override
    public int minesCount() {
        return 40;
    }

    @Override
    public List<Cell> getCells() {
		return null;
	}
}
