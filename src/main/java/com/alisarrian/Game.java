package com.alisarrian;

public class Game {
    private String[][] board = {
            {"", "", ""},
            {"", "", ""},
            {"", "", ""}
    };

    void play(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("X is outside board.");
        }
        if (y < 1 || y > 3) {
            throw new RuntimeException("Y is outside board.");
        }

        if (board[x - 1][y - 1] != "") {
            throw new RuntimeException("This field is occupied.");
        } else {
            board[x - 1][y - 1] = "occupied";
        }
    }
}
