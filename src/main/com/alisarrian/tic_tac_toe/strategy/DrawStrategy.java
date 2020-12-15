package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;

import java.util.Arrays;

public class DrawStrategy implements CheckStrategy {
    @Override
    public Answer matches(Field playerSign, Field[][] grid) {
        return noAllFieldsTaken(grid) ? Answer.NO_WINNER : Answer.DRAW;
    }

    private boolean noAllFieldsTaken(Field[][] grid) {
        return Arrays.stream(grid).flatMap(Arrays::stream).anyMatch(field -> field == Field.EMPTY);
    }
}
