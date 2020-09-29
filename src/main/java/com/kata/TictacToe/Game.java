package com.kata.TictacToe;

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
        return isPlayerXonGivenPosition(2) && isPlayerXonGivenPosition(5) && isPlayerXonGivenPosition(8)
                || isPlayerXonGivenPosition(1) && isPlayerXonGivenPosition(4) && isPlayerXonGivenPosition(7)
                || isPlayerXonGivenPosition(0) && isPlayerXonGivenPosition(3) && isPlayerXonGivenPosition(6);
    }

    private boolean isAnyRowFilledByPlayerX() {
        return isPlayerXonGivenPosition(0) && isPlayerXonGivenPosition(1) && isPlayerXonGivenPosition(2)
                || isPlayerXonGivenPosition(3) && isPlayerXonGivenPosition(4) && isPlayerXonGivenPosition(5)
                || isPlayerXonGivenPosition(6) && isPlayerXonGivenPosition(7) && isPlayerXonGivenPosition(8);
    }

    private boolean isAnyDiagonalFilledByPlayerX() {
        return isPlayerXonGivenPosition(0) && isPlayerXonGivenPosition(4) && isPlayerXonGivenPosition(8)
                || isPlayerXonGivenPosition(2) && isPlayerXonGivenPosition(4) && isPlayerXonGivenPosition(6);
    }

    private boolean isPlayerXonGivenPosition(int position) {
        return getPlayerAtPosition(position) == PLAYER_X;
    }

    private boolean isAnyColumnFilledByPlayerO() {
        return isPlayerOonGivenPosition(2) && isPlayerOonGivenPosition(5) && isPlayerOonGivenPosition(8)
                || isPlayerOonGivenPosition(1) && isPlayerOonGivenPosition(4) && isPlayerOonGivenPosition(7)
                || isPlayerOonGivenPosition(0) && isPlayerOonGivenPosition(3) && isPlayerOonGivenPosition(6);
    }

    private boolean isAnyRowFilledByPlayerO() {
        return isPlayerOonGivenPosition(0) && isPlayerOonGivenPosition(1) && isPlayerOonGivenPosition(2)
                || isPlayerOonGivenPosition(3) && isPlayerOonGivenPosition(4) && isPlayerOonGivenPosition(5)
                || isPlayerOonGivenPosition(6) && isPlayerOonGivenPosition(7) && isPlayerOonGivenPosition(8);
    }

    private boolean isAnyDiagonalFilledByPlayerO() {
        return isPlayerOonGivenPosition(0) && isPlayerOonGivenPosition(4) && isPlayerOonGivenPosition(8)
                || isPlayerOonGivenPosition(2) && isPlayerOonGivenPosition(4) && isPlayerOonGivenPosition(6);
    }

    private boolean isPlayerOonGivenPosition(int position) {
        return getPlayerAtPosition(position) == PLAYER_O;
    }

}
