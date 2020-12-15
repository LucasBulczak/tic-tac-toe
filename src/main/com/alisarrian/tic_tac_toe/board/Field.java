package com.alisarrian.tic_tac_toe.board;

enum Field {
    X("X"),
    O("O"),
    EMPTY(".");

    private final String sign;

    Field(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return sign;
    }
}
