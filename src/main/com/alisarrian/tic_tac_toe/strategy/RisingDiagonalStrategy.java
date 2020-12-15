package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;

public class RisingDiagonalStrategy implements CheckStrategy{
    @Override
    public Answer matches(Field playerSign, Field[][] grid) {
        int matches = 0;
        for (int i = (grid.length - 1), j = 0; i >= 0; i--, j++) {
            if (grid[i][j] == playerSign) matches++;
        }
        return (matches == grid.length) ? Answer.WINNER : Answer.NO_WINNER;
    }
}
