package com.alisarrian;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class GameTest {

    private Game game;

    @BeforeMethod
    public void setUp() {
        game = new Game();
    }

    @Test(expectedExceptions = RuntimeException.class)
    void shouldThrowRuntimeExceptionWhenXOutsideOfBoard() {
        game.play(4, 1);
    }

    @Test(expectedExceptions = RuntimeException.class)
    void shouldThrowRuntimeExceptionWhenYOutsideOfBoard() {
        game.play(1, 4);
    }

    @Test(expectedExceptions = RuntimeException.class)
    void shouldThrowRuntimeExceptionWhenFieldIsOccupied() {
        game.play(1, 1);
        game.play(1, 1);
    }
}
