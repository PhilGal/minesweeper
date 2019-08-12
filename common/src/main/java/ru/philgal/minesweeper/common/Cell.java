package ru.philgal.minesweeper.common;

public interface Cell {

    Type getType();

    enum  Type {
        EMPTY, MINE, NUMBER
    }
}
