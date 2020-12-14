package com.alisarrian;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class TurnQueueTest {
    private TurnQueue turnQueue;

    private static final Player X = new Player("X");
    private static final Player Y = new Player("Y");

    @BeforeMethod
    public void setUp() {
        turnQueue = new TurnQueue(List.of(X, Y));
    }

    @Test
    void shouldReturnXAsActivePlayer() {
        assertEquals(turnQueue.getActivePlayer(), X);
    }

    @Test
    void shouldReturnYAsASecondActivePlayer() {
        turnQueue.next();
        assertEquals(turnQueue.getActivePlayer(), Y);
    }

    @Test
    void shouldRollEntireQueue() {
        turnQueue.next();
        turnQueue.next();
        assertEquals(turnQueue.getActivePlayer(), X);
    }
}
