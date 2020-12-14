package com.alisarrian;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GameTest {

    private Game game;

    @BeforeMethod
    public void setUp() {
        game = new Game();
    }

    @Test(expectedExceptions = RuntimeException.class)
    void shouldThrowRuntimeExceptionWhenFieldOutsideOfBoard() {
        game.play(4, 0);
    }
}
