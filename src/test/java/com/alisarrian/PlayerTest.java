package com.alisarrian;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PlayerTest {

    @Test
    void shouldReturnXAsDefaultFirstPlayer() {
        final var player = new Player();

        String actual = player.getName();

        String expected = "X";
        assertEquals(actual, expected);
    }
}
