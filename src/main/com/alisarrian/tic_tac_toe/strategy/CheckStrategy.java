package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;

public interface CheckStrategy {
    Answer matches(Field playerSign, Field[][] board);
}
