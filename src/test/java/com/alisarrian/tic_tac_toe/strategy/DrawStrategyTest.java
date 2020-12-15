package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DrawStrategyTest {
    private static final Field[][] DRAW = {
            {Field.X, Field.X, Field.O},
            {Field.O, Field.O, Field.X},
            {Field.X, Field.O, Field.X}
    };

    private static final Field[][] NO_DRAW = {
            {Field.X, Field.EMPTY, Field.EMPTY},
            {Field.EMPTY, Field.EMPTY, Field.EMPTY},
            {Field.EMPTY, Field.EMPTY, Field.EMPTY}
    };

    private CheckStrategy sut;

    @BeforeMethod
    public void setUp() {
        sut = new DrawStrategy();
    }

    @Test
    void shouldReturnDrawResult() {
        final var result = sut.matches(Field.X, DRAW);
        assertEquals(Answer.DRAW, result);
    }

    @Test
    void shouldReturnNoWinnerResult() {
        final var result = sut.matches(Field.X, NO_DRAW);
        assertEquals(Answer.NO_WINNER, result);
    }
}