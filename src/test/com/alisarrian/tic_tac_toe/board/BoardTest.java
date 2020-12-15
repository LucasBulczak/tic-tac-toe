package com.alisarrian.tic_tac_toe.board;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.alisarrian.tic_tac_toe.board.Field.O;
import static com.alisarrian.tic_tac_toe.board.Field.X;
import static org.testng.Assert.*;

public class BoardTest {

    private static final int BOARD_SIZE = 3;

    private Board board;

    @BeforeMethod
    public void setUp() {
        board = new Board(BOARD_SIZE);
    }

    @Test
    void shouldAddField() {
        board.add(new Point(0, 0), X);

        Field field = board.getGrid()[0][0];

        assertEquals(X, field);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void shouldIllegalArgumentExceptionWhenYouAddFieldToNotEmptyPlace() {
        board.add(new Point(0, 0), X);
        board.add(new Point(0, 0), O);
    }
}