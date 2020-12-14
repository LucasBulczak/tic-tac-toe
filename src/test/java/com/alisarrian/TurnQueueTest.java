package com.alisarrian;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TurnQueueTest {
    private TurnQueue turnQueue;

    @BeforeMethod
    public void setUp() {
        turnQueue = new TurnQueue();
    }

    @Test
    void shouldReturnXAsActivePlayer() {
        Player expected = new Player("X");
        Player actual = turnQueue.getActivePlayer();
        assertEquals(actual, expected);
    }
}
