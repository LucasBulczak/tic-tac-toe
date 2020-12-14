package com.alisarrian;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class TurnQueueTest {
    private TurnQueue turnQueue;

    private static final Player X = new Player("X");
    private static final Player Y = new Player("Y");
    private Collection<Player> playersQueue;

    @BeforeMethod
    public void setUp() {
        playersQueue = new ArrayList<>();
        playersQueue.add(X);
        playersQueue.add(Y);
        turnQueue = new TurnQueue(playersQueue);
    }

    @Test
    void shouldReturnXAsActivePlayer() {
        Player actual = turnQueue.getActivePlayer();
        assertEquals(actual, X);
    }

    @Test
    void shouldReturnYAsASecondPlayer() {
        turnQueue.next();
        Player actual = turnQueue.getActivePlayer();
        assertEquals(actual, Y);
    }

    @Test
    void shouldRollEntireQueue() {
        turnQueue.next();
        turnQueue.next();
        Player actual = turnQueue.getActivePlayer();
        assertEquals(actual, X);
    }
}
