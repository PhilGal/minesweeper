package ru.philgal.minesweeper.common;

public class CellFactory implements Factory<Cell> {

    private Cell.Type type;

    public CellFactory(Cell.Type type) {
        this.type = type;
    }

    @Override
    public Cell create() {
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
