package com.alisarrian;

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
        playerQueue.addAll(playerList);

        next();
    }

    Player getActivePlayer() {
        return activePlayer;
    }

    void next() {
        activePlayer = playerQueue.poll();
    }
}
