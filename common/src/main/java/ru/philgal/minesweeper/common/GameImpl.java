package ru.philgal.minesweeper.common;

class GameImpl implements Game {

    private final FieldFactory fieldFactory;

    GameImpl(GameDifficulty gameDifficulty) {
        this.fieldFactory = new FieldFactory(gameDifficulty);
        System.out.println("Created a new game at " + gameDifficulty + " difficulty.");
    }

    @Override
    public void startNew() {
        Field field = fieldFactory.create();
        System.out.println("Field size: " + field.fieldSize());
        System.out.println("Mines count: " + field.minesCount());
    }
}
