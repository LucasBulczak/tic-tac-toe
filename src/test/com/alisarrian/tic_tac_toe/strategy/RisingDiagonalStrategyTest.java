package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.alisarrian.tic_tac_toe.board.Field.*;
import static com.alisarrian.tic_tac_toe.board.Field.O;
import static org.testng.Assert.*;

public class RisingDiagonalStrategyTest {
    private static final Field[][] X_WIN = {
            {O, EMPTY,     X},
            {O,     X, EMPTY},
            {X, EMPTY, EMPTY}
    };

    private static final Field[][] O_WIN = {
            {X,     X,     O},
            {X,     O, EMPTY},
            {O, EMPTY, EMPTY}
    };

    private static final Field[][] NO_WIN = {
            {    X, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };

    private CheckStrategy sut;

    @BeforeMethod
    public void setUp() {
        sut = new RisingDiagonalStrategy();
    }

    @Test
    void shouldReturnXWinnerResult() {
        final var result = sut.matches(X, X_WIN);
        assertEquals(Answer.WINNER, result);
    }

    @Test
    void shouldReturnOWinnerResult() {
        final var result = sut.matches(O, O_WIN);
        assertEquals(Answer.WINNER, result);
    }

    @Test
    void shouldReturnXNoWinnerResult() {
        final var result = sut.matches(X, NO_WIN);
        assertEquals(Answer.NO_WINNER, result);
    }

    @Test
    void shouldReturnONoWinnerResult() {
        final var result = sut.matches(O, NO_WIN);
        assertEquals(Answer.NO_WINNER, result);
    }
}