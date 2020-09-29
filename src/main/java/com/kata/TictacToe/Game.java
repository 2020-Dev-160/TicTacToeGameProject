package com.kata.TictacToe;

import static com.kata.TictacToe.GameConstant.*;

public class Game {
    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    char previousPlayer;
    char[] board = new char[9];

    public char getPlayerAtPosition(int positionNumber) {
        return board[positionNumber];
    }

    private char getCurrentPlayer() {
        return previousPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
    }

    public void playAtPosition(int positionNumber) {
        char currentPlayer = getCurrentPlayer();
        board[positionNumber] = currentPlayer;
        previousPlayer = currentPlayer;
    }

    public char getWinner() {
        char winner = 0;
        if (isAnyColumnFilledByPlayerX() || isAnyRowFilledByPlayerX() || isAnyDiagonalFilledByPlayerX()) {
            winner = PLAYER_X;
        }
        if (isAnyColumnFilledByPlayerO() || isAnyRowFilledByPlayerO() || isAnyDiagonalFilledByPlayerO()) {
            winner = PLAYER_O;
        }
        return winner;
    }

    private boolean isAnyColumnFilledByPlayerX() {
        return isPlayerXonGivenPosition(SECOND_POSITION) && isPlayerXonGivenPosition(FIFTH_POSITION) && isPlayerXonGivenPosition(EIGHTH_POSITION)
                || isPlayerXonGivenPosition(FIRST_POSITION) && isPlayerXonGivenPosition(FOURTH_POSITION) && isPlayerXonGivenPosition(SEVENTH_POSITION)
                || isPlayerXonGivenPosition(ZERO_POSITION) && isPlayerXonGivenPosition(THIRD_POSITION) && isPlayerXonGivenPosition(SIXTH_POSITION);
    }

    private boolean isAnyRowFilledByPlayerX() {
        return isPlayerXonGivenPosition(ZERO_POSITION) && isPlayerXonGivenPosition(FIRST_POSITION) && isPlayerXonGivenPosition(SECOND_POSITION)
                || isPlayerXonGivenPosition(THIRD_POSITION) && isPlayerXonGivenPosition(FOURTH_POSITION) && isPlayerXonGivenPosition(FIFTH_POSITION)
                || isPlayerXonGivenPosition(SIXTH_POSITION) && isPlayerXonGivenPosition(SEVENTH_POSITION) && isPlayerXonGivenPosition(EIGHTH_POSITION);
    }

    private boolean isAnyDiagonalFilledByPlayerX() {
        return isPlayerXonGivenPosition(ZERO_POSITION) && isPlayerXonGivenPosition(FOURTH_POSITION) && isPlayerXonGivenPosition(EIGHTH_POSITION)
                || isPlayerXonGivenPosition(SECOND_POSITION) && isPlayerXonGivenPosition(FOURTH_POSITION) && isPlayerXonGivenPosition(SIXTH_POSITION);
    }

    private boolean isPlayerXonGivenPosition(int position) {
        return getPlayerAtPosition(position) == PLAYER_X;
    }

    private boolean isAnyColumnFilledByPlayerO() {
        return isPlayerOonGivenPosition(SECOND_POSITION) && isPlayerOonGivenPosition(FIFTH_POSITION) && isPlayerOonGivenPosition(EIGHTH_POSITION)
                || isPlayerOonGivenPosition(FIRST_POSITION) && isPlayerOonGivenPosition(FOURTH_POSITION) && isPlayerOonGivenPosition(SEVENTH_POSITION)
                || isPlayerOonGivenPosition(ZERO_POSITION) && isPlayerOonGivenPosition(THIRD_POSITION) && isPlayerOonGivenPosition(SIXTH_POSITION);
    }

    private boolean isAnyRowFilledByPlayerO() {
        return isPlayerOonGivenPosition(ZERO_POSITION) && isPlayerOonGivenPosition(FIRST_POSITION) && isPlayerOonGivenPosition(SECOND_POSITION)
                || isPlayerOonGivenPosition(THIRD_POSITION) && isPlayerOonGivenPosition(FOURTH_POSITION) && isPlayerOonGivenPosition(FIFTH_POSITION)
                || isPlayerOonGivenPosition(SIXTH_POSITION) && isPlayerOonGivenPosition(SEVENTH_POSITION) && isPlayerOonGivenPosition(EIGHTH_POSITION);
    }

    private boolean isAnyDiagonalFilledByPlayerO() {
        return isPlayerOonGivenPosition(ZERO_POSITION) && isPlayerOonGivenPosition(FOURTH_POSITION) && isPlayerOonGivenPosition(EIGHTH_POSITION)
                || isPlayerOonGivenPosition(SECOND_POSITION) && isPlayerOonGivenPosition(FOURTH_POSITION) && isPlayerOonGivenPosition(SIXTH_POSITION);
    }

    private boolean isPlayerOonGivenPosition(int position) {
        return getPlayerAtPosition(position) == PLAYER_O;
    }

}
