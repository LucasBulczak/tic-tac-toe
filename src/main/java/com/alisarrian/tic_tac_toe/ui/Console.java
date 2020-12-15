package com.alisarrian.tic_tac_toe.ui;

import com.alisarrian.tic_tac_toe.board.Board;
import com.alisarrian.tic_tac_toe.board.Field;
import com.alisarrian.tic_tac_toe.board.Point;
import com.alisarrian.tic_tac_toe.board.Range;

import java.io.PrintStream;
import java.util.Scanner;

public class Console implements UI {
    private static final String ROW = "row";
    private static final String COLUMN = "column";

    private final Scanner input;
    private final PrintStream output;

    public Console() {
        this.input = new Scanner(System.in);
        this.output = System.out;
    }

    @Override
    public Point readNumber(Range range) {
        return getPointIn(range);
    }

    @Override
    public void printBoard(Board board) {
        showMessage(show(board));
    }

    public String show(Board board) {
        StringBuilder stringBoard = new StringBuilder();
        final var grid = board.getGrid();

        for (int row = 0; row < board.getSize(); row++) {
            StringBuilder columnSeparator = new StringBuilder();
            addRow(stringBoard, grid[row], columnSeparator);
            addRowSeparator(stringBoard, columnSeparator);
        }

        removeLastRowSeparator(stringBoard);
        return stringBoard.toString();
    }

    private void addRow(StringBuilder board, Field[] chars, StringBuilder columnSeparator) {
        for (Field aChar : chars) {
            board.append(" ");
            board.append(aChar);
            board.append(" |");
            columnSeparator.append("---|");
        }
    }

    private void addRowSeparator(StringBuilder board, StringBuilder columnSeparator) {
        board.deleteCharAt(board.length() - 1);
        board.append("\n");
        columnSeparator.deleteCharAt(columnSeparator.length() - 1);
        board.append(columnSeparator);
        board.append("\n");
    }

    private void removeLastRowSeparator(StringBuilder board) {
        board.delete((board.deleteCharAt(board.length() - 1).lastIndexOf("\n")), board.length());
    }

    private Point getPointIn(Range range) {
        final var x = getCoordinateFor(ROW, range);
        final var y = getCoordinateFor(COLUMN, range);

        return new Point(x, y);
    }

    private int getCoordinateFor(String message, Range range) {
        while(true) {
            displayInputPrompt(range, message);
            int number = input.nextInt();
            if (range.in(number)) {
                return number;
            }
            showMessage("Number outside of the range!");
        }
    }

    private void displayInputPrompt(Range range, String message) {
        String prompt = String.format("Enter a %s number (between %d and %d):",
                message, range.getLowerBound(), range.getUpperBound() - 1);
        showMessage(prompt);
    }

    private void showMessage(String message) {
        output.println(message);
    }
}
