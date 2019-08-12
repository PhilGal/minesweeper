package ru.philgal.minesweeper.common;

class EmptyCell implements Cell {
    @Override
    public Type getType() {
        return Type.EMPTY;
    }
}
