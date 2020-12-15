package game;

import com.alisarrian.tic_tac_toe.board.Board;
import com.alisarrian.tic_tac_toe.player.Player;
import com.alisarrian.tic_tac_toe.player.TurnQueue;
import com.alisarrian.tic_tac_toe.ui.UI;

public class TicTacToeGame {
    private final Board board;
    private final UI ui;
    private final TurnQueue queue;
    private final Player activePlayer;

    public TicTacToeGame(UI ui, TurnQueue queue, int boardSize) {
        this.ui = ui;
        this.queue = queue;
        board = new Board(boardSize);
        activePlayer = queue.getActivePlayer();
    }

    Player play() {
        boolean noWinners = false;
        do {

        } while (!noWinners);
        return activePlayer;
    }
}
