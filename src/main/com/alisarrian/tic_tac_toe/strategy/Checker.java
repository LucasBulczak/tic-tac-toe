package com.alisarrian.tic_tac_toe.strategy;

import com.alisarrian.tic_tac_toe.board.Field;
import com.alisarrian.tic_tac_toe.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Checker {
    private final List<CheckStrategy> strategies;

    public Checker() {
        strategies = new ArrayList<>();
        strategies.add(new HorizontalStrategy());
        strategies.add(new VerticalStrategy());
        strategies.add(new RisingDiagonalStrategy());
        strategies.add(new FallingDiagonalStrategy());
        strategies.add(new DrawStrategy());
    }

    public Answer checkFor(Player player, Field[][] grid) {
        Answer answer = Answer.NO_WINNER;
        for (CheckStrategy strategy : strategies) {
            answer = strategy.matches(player.getSign(), grid);
            if (answer == Answer.WINNER) break;
        }
        return answer;
    }
}
