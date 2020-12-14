package com.alisarrian;

import org.testng.annotations.BeforeMethod;

public class GameTest {

    @BeforeMethod
    public void setUp() {
        final var game = new Game();
    }
}
