package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.alisarrian.tic_tac_toe.board.Field.*;
import static com.alisarrian.tic_tac_toe.board.Field.O;
import static org.testng.Assert.*;

public class FallingDiagonalStrategyTest {
    private static final Field[][] X_WIN = {
            {    X, EMPTY, EMPTY},
            {EMPTY,     X, EMPTY},
            {    O,     O,     X}
    };

    private static final Field[][] O_WIN = {
            {    O,     X, EMPTY},
            {    X,     O, EMPTY},
            {    X,     X,     O}
    };

    private static final Field[][] NO_WIN = {
            {    X, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };

    private CheckStrategy sut;

    @BeforeMethod
    public void setUp() {
        sut = new FallingDiagonalStrategy();
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
    void shouldReturnNoWinnerResultForX() {
        final var result = sut.matches(X, NO_WIN);
        assertEquals(Answer.NO_WINNER, result);
    }

    @Test
    void shouldReturnNoWinnerResultForO() {
        final var result = sut.matches(O, NO_WIN);
        assertEquals(Answer.NO_WINNER, result);
    }
}