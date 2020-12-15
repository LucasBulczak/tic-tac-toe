package com.alisarrian.tic_tac_toe.player;

import com.alisarrian.tic_tac_toe.board.Field;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class TurnQueueTest {
    private static final Player X = new HumanPlayer(null, Field.X);
    private static final Player O = new HumanPlayer(null, Field.O);

    private TurnQueue turnQueue;

    @BeforeMethod
    public void setUp() {
        turnQueue = new TurnQueue(List.of(X, O));
    }

    @Test
    void shouldReturnXAsActivePlayer() {
        assertEquals(turnQueue.getActivePlayer(), X);
    }

    @Test
    void shouldReturnYAsASecondActivePlayer() {
        turnQueue.next();
        assertEquals(turnQueue.getActivePlayer(), O);
    }

    @Test
    void shouldRollEntireQueue() {
        turnQueue.next();
        turnQueue.next();
        assertEquals(turnQueue.getActivePlayer(), X);
    }
}