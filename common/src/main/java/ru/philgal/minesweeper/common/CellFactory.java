package ru.philgal.minesweeper.common;

public class CellFactory {

    private CellFactory() {
    }

    
    public static Cell create(Cell.Type type) {
        switch (type) {
            case MINE:
                return new MineCell();
            case EMPTY:
                return new EmptyCell();
            case NUMBER:
                return new NumberCell();
            //fixme: create domain-specific exception class
            default:
                throw new IllegalArgumentException("Unknown cell type");
        }
    }
}
