package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalStrategyTest {
    private static final Field[][] X_WIN = {
            {    Field.X,     Field.X,     Field.X},
            {Field.EMPTY, Field.EMPTY, Field.EMPTY},
            {    Field.O,     Field.O, Field.EMPTY}
    };

    private static final Field[][] O_WIN = {
            {    Field.X, Field.EMPTY,     Field.X},
            {    Field.X, Field.EMPTY, Field.EMPTY},
            {    Field.O,     Field.O,     Field.O}
    };

    private static final Field[][] NO_WIN = {
            {    Field.X, Field.EMPTY, Field.EMPTY},
            {Field.EMPTY, Field.EMPTY, Field.EMPTY},
            {Field.EMPTY, Field.EMPTY, Field.EMPTY}
    };

    private CheckStrategy sut;

    @BeforeMethod
    public void setUp() {
        sut = new HorizontalStrategy();
    }

    @Test
    void shouldReturnXWinnerResult() {
        final var result = sut.matches(Field.X, X_WIN);
        assertEquals(Answer.WINNER, result);
    }

    @Test
    void shouldReturnWinnerResult() {
        final var result = sut.matches(Field.O, O_WIN);
        assertEquals(Answer.WINNER, result);
    }

    @Test
    void shouldReturnNoWinnerResultForX() {
        final var result = sut.matches(Field.X, NO_WIN);
        assertEquals(Answer.NO_WINNER, result);
    }

    @Test
    void shouldReturnNoWinnerResultForO() {
        final var result = sut.matches(Field.O, NO_WIN);
        assertEquals(Answer.NO_WINNER, result);
    }
}