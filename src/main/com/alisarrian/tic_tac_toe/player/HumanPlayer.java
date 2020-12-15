package com.alisarrian.tic_tac_toe.player;

import com.alisarrian.tic_tac_toe.board.Field;
import com.alisarrian.tic_tac_toe.board.Point;
import com.alisarrian.tic_tac_toe.board.Range;
import com.alisarrian.tic_tac_toe.ui.UI;

public class HumanPlayer implements Player {
    private final UI ui;
    private final Field field;

    public HumanPlayer(UI ui, Field field) {
        this.ui = ui;
        this.field = field;
    }

    @Override
    public Point getPoint(Range range) {
        return ui.readNumber(range);
    }

    @Override
    public Field getSign() {
        return field;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + getSign();
    }
}
