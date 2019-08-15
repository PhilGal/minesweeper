package ru.philgal.minesweeper.common;

import java.util.List;

public class Position {

    public final int x, y;
    //this field is required for validation only.
    private final int fieldLength;
    private List<Position> aps;

    public Position(int x, int y, int fieldLength) {
        // todo: validate coordinates
        isValid(x, y, fieldLength);
        this.x = x;
        this.y = y;
        this.fieldLength = fieldLength;
    }

    private static void isValid(int x, int y, int fieldLength) {
        boolean tooSparse = Math.abs(x - y) > 1;
        boolean neg = x < 0 || y < 0;

        if (tooSparse || neg) {
            throw new IllegalArgumentException(String.format("Invalid position coordinates (%d, %d)", x, y));
        }

        if (fieldLength < 1) {
            throw new IllegalArgumentException("Field is too small");
        }
    }
}
