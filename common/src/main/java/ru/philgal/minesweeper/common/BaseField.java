package ru.philgal.minesweeper.common;

import java.util.List;

abstract class BaseField implements Field {

    private List<Cell> cells;

    @Override
    public List<Cell> getCells() {
        return cells;
    }
    
}