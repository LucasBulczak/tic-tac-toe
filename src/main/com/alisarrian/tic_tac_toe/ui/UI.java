package com.alisarrian.tic_tac_toe.ui;

import com.alisarrian.tic_tac_toe.board.Board;
import com.alisarrian.tic_tac_toe.board.Point;
import com.alisarrian.tic_tac_toe.board.Range;

public interface UI {
    Point readNumber(Range range);
    void printBoard(Board board);
}
