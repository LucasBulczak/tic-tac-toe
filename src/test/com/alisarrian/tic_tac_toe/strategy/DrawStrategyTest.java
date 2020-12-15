package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.alisarrian.tic_tac_toe.board.Field.*;
import static com.alisarrian.tic_tac_toe.board.Field.X;
import static org.testng.Assert.*;

public class DrawStrategyTest {
    private static final Field[][] DRAW = {
            {X, X, O},
            {O, O, X},
            {X, O, X}
    };

    private static final Field[][] NO_DRAW = {
            {X, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };

    private CheckStrategy sut;

    @BeforeMethod
    public void setUp() {
        sut = new DrawStrategy();
    }

    @Test
    void shouldReturnDrawResult() {
        final var result = sut.matches(X, DRAW);
        assertEquals(Answer.DRAW, result);
    }

    @Test
    void shouldReturnNoWinnerResult() {
        final var result = sut.matches(X, NO_DRAW);
        assertEquals(Answer.NO_WINNER, result);
    }
}