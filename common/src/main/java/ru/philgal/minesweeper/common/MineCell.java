package ru.philgal.minesweeper.common;

class MineCell implements Cell {
    @Override
    public Type getType() {
        return Type.MINE;
    }
}
