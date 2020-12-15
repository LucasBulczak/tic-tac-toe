package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;

import java.util.stream.IntStream;

public class FallingDiagonalStrategy implements CheckStrategy {
    @Override
    public Answer matches(Field playerSign, Field[][] grid) {
        int matches = (int) IntStream.range(0, grid.length)
                .filter(i -> checkSign(playerSign, grid, i))
                .count();

        return (matches == grid.length) ? Answer.WINNER : Answer.NO_WINNER;
    }

    private boolean checkSign(Field playerSign, Field[][] grid, int i) {
        return grid[i][i] == playerSign;
    }
}
