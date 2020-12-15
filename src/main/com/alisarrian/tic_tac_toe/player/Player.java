package com.alisarrian.tic_tac_toe.player;

import com.alisarrian.tic_tac_toe.board.Field;
import com.alisarrian.tic_tac_toe.board.Point;
import com.alisarrian.tic_tac_toe.board.Range;

interface Player {
    Point getPoint(Range range);
    Field getSign();
    String toString();
}
