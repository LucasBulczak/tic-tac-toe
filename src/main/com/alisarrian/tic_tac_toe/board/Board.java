package com.alisarrian.tic_tac_toe.board;

public class Board {
    private final int size;

    private Field[][] grid;

    public Board(int size) {
        this.size = size;
        init();
    }

    void init() {
        grid = new Field[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = Field.EMPTY;
            }
        }
    }

    public Field[][] getGrid() {
        return grid;
    }

    public int getSize() {
        return size;
    }

    public void add(Point aPoint, Field playerSign) {
        throwExceptionWhenFieldIsTaken(aPoint);
        grid[aPoint.getX()][aPoint.getY()] = playerSign;
    }

    private void throwExceptionWhenFieldIsTaken(Point aPoint) {
        if (!isOnBoard(aPoint) || isFieldTaken(aPoint)) {
            throw new IllegalArgumentException("You cannot place the FIELD on a non-empty field!");
        }
    }

    private boolean isFieldTaken(Point aPoint) {
        return grid[aPoint.getX()][aPoint.getY()] != Field.EMPTY;
    }

    private boolean isOnBoard(Point aPoint) {
        return aPoint.getX() >= 0 &&
                aPoint.getX() < size &&
                aPoint.getY() >= 0 &&
                aPoint.getY() < size;
    }
}
