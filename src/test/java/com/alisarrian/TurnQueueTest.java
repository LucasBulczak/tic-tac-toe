package com.alisarrian;

import org.testng.annotations.BeforeMethod;

public class TurnQueueTest {
    private TurnQueue turnQueue;

    @BeforeMethod
    public void setUp() {
        turnQueue = new TurnQueue();
    }
}
