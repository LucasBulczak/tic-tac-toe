package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;

public class DrawStrategy implements CheckStrategy {
    @Override
    public Answer matches(Field playerSign, Field[][] board) {
        return null;
    }
}
