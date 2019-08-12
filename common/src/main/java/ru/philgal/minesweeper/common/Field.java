package ru.philgal.minesweeper.common;

import java.util.List;

public interface Field {

    int fieldSize();

    int minesCount();

	List<Cell> getCells();
}
