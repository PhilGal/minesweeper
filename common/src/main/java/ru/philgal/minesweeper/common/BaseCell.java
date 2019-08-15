package ru.philgal.minesweeper.common;

class BaseCell implements Cell {

    private final Type type;
    private final Position position;

    public BaseCell(Type type, Position position) {
        this.type = type;
        this.position = position;
    }

    @Override
    public Type getType() {
        return type;
    }

}
