package ru.philgal.minesweeper.common;

public class Position {

    private final int x, y;

    public Position(int x, int y) {
        //todo: validate coordinates
        this.x = x;
        this.y = y;
    }
}
