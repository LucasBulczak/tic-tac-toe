package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;

import java.util.stream.IntStream;

public class HorizontalStrategy implements CheckStrategy {
    @Override
    public Answer matches(Field playerSign, Field[][] grid) {
        for (Field[] fields : grid) {
            int matches = (int) IntStream.range(0, grid.length)
                    .filter(j -> fields[j] == playerSign)
                    .count();
            if (matches == grid.length) return Answer.WINNER;
        }
        return Answer.NO_WINNER;
    }
}
