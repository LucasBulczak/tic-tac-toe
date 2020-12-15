package game;

import com.alisarrian.tic_tac_toe.board.Board;
import com.alisarrian.tic_tac_toe.player.TurnQueue;
import com.alisarrian.tic_tac_toe.ui.UI;

public class TicTacToeGame {
    private final Board board;
    private UI ui;
    private final TurnQueue queue;

    public TicTacToeGame(UI ui, TurnQueue queue, int boardSize) {
        this.ui = ui;
        this.queue = queue;
        board = new Board(boardSize);
    }
}
