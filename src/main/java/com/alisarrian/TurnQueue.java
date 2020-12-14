package com.alisarrian;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class TurnQueue {
    private Player activePlayer;
    private final Queue<Player> playerQueue;
    private final Collection<Player> playerList;

    TurnQueue(Collection<Player> players) {
        playerList = players;
        playerQueue = new LinkedList<>();
        init();
        next();
    }

    Player getActivePlayer() {
        return activePlayer;
    }

    void next() {
        if (playerQueue.isEmpty()) {
            init();
        }
        activePlayer = playerQueue.poll();
    }

    private void init() {
        playerQueue.addAll(playerList);
    }
}
