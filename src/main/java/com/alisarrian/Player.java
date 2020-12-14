package com.alisarrian;

class Player {
    private final String name;

    Player() {
        this("X");
    }

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
