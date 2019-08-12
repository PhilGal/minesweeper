package ru.philgal.minesweeper;

import ru.philgal.minesweeper.common.Game;
import ru.philgal.minesweeper.common.ConsoleAppGameFactory;

public class GameLauncher {

    public static void main(String[] args) {
        String difficulty = parseDifficulty(args);
        Game game = new ConsoleAppGameFactory(difficulty).create();
        game.startNew();
    }

    private static String parseDifficulty(String[] args) {
        for (String arg : args) {
            if (arg.startsWith("-d")) {
                return arg.split("=")[1];
            }
        }
        return ArgFlags.DIFFICULTY_INTERMEDIATE;
    }
}
