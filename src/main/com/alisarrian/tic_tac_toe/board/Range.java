package com.alisarrian.tic_tac_toe.board;

public class Range {

    private final int lowerBound;
    private final int upperBound;

    public Range(int upperBound) {
        this(0, upperBound);
    }

    private Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public boolean in(int value) {
        return value >= lowerBound && value < upperBound;
    }
}
