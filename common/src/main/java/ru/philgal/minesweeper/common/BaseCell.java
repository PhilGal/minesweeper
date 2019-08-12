package ru.philgal.minesweeper.common;

class BaseCell implements Cell {

    private final Type type;

    public BaseCell(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

}
