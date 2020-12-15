package com.alisarrian.tic_tac_toe.player;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class TurnQueue {
    private Player activePlayer;
    private final Queue<Player> playerQueue;
    private final Collection<Player> playerList;

    public TurnQueue(Collection<Player> players) {
        playerList = players;
        playerQueue = new LinkedList<>();
        init();
        next();
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void next() {
        if (playerQueue.isEmpty()) {
            init();
        }
        activePlayer = playerQueue.poll();
    }

    private void init() {
        playerQueue.addAll(playerList);
    }
}
