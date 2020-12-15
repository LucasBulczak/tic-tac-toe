package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;

public class VerticalStrategy implements CheckStrategy {
    @Override
    public Answer matches(Field playerSign, Field[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            int matches = 0;
            for (Field[] fields : grid) {
                if (fields[i] == playerSign) matches++;
            }
            if (matches == grid.length) return Answer.WINNER;
        }
        return Answer.NO_WINNER;
    }
}
