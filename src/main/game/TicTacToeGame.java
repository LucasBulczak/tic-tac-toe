package game;

import com.alisarrian.tic_tac_toe.board.Board;
import com.alisarrian.tic_tac_toe.board.Point;
import com.alisarrian.tic_tac_toe.board.Range;
import com.alisarrian.tic_tac_toe.player.Player;
import com.alisarrian.tic_tac_toe.player.TurnQueue;
import com.alisarrian.tic_tac_toe.strategy.Answer;
import com.alisarrian.tic_tac_toe.strategy.Checker;
import com.alisarrian.tic_tac_toe.ui.UI;

public class TicTacToeGame {
    private final Checker checker = new Checker();
    private final Board board;
    private final UI ui;
    private final TurnQueue queue;
    private final Range range;

    private Player activePlayer;

    public TicTacToeGame(UI ui, TurnQueue queue, int boardSize) {
        this.ui = ui;
        this.queue = queue;
        activePlayer = queue.getActivePlayer();
        board = new Board(boardSize);
        range = new Range(boardSize);
    }

    public Player play() {
        boolean noWinners;
        do {
            Answer answer = takeCoordinatesFromPlayer();
            ui.printBoard(board);
            noWinners = noWinner(answer);
            nextPlayer(noWinners);
        } while (!noWinners);
        return activePlayer;
    }

    private Answer takeCoordinatesFromPlayer() {
        Point point = activePlayer.getPoint(range);
        board.add(point, activePlayer.getSign());
        return checker.checkFor(activePlayer, board.getGrid());
    }

    private void nextPlayer(boolean noWinners) {
        if (!noWinners) {
            queue.next();
            activePlayer = queue.getActivePlayer();
        }
    }

    private boolean noWinner(Answer answer) {
        return answer != Answer.NO_WINNER;
    }
}
