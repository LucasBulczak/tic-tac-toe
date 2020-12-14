package com.alisarrian;

public class Game {
    private String[][] board = {
            {"", "", ""},
            {"", "", ""},
            {"", "", ""}
    };

    void play(int x, int y) {
        checkRange(x);
        checkRange(y);

        setOccupied(x, y);
    }

    private void setOccupied(int x, int y) {
        if (board[x - 1][y - 1] != "") {
            throw new RuntimeException("This field is occupied.");
        } else {
            board[x - 1][y - 1] = "occupied";
        }
    }

    private void checkRange(int coordinate) {
        if (coordinate < 1 || coordinate > 3) {
            throw new RuntimeException("Given coordinate is outside of the board.");
        }
    }
}
