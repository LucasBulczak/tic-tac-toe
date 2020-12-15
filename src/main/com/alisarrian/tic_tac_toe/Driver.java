package com.alisarrian.tic_tac_toe;

import com.alisarrian.tic_tac_toe.board.Field;
import com.alisarrian.tic_tac_toe.player.HumanPlayer;
import com.alisarrian.tic_tac_toe.player.Player;
import com.alisarrian.tic_tac_toe.player.TurnQueue;
import com.alisarrian.tic_tac_toe.ui.Console;
import com.alisarrian.tic_tac_toe.ui.UI;
import game.TicTacToeGame;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        UI ui = new Console();

        Player playerX = new HumanPlayer(ui, Field.X);
        Player playerY = new HumanPlayer(ui, Field.O);
        TurnQueue turnQueue = new TurnQueue(List.of(playerX, playerY));

        TicTacToeGame game = new TicTacToeGame(ui, turnQueue, 3);

        var winner = game.play();
        System.out.println("The winner is: " + winner);
    }
}
