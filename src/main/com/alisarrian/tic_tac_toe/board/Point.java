package com.alisarrian.tic_tac_toe.board;

import java.util.Objects;

public class Point {

    private final int x;
    private final int y;

    public Point(int aX, int aY) {
        x = aX;
        y = aY;
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        Point point = (Point) aO;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}