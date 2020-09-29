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
        if (getPlayerAtPosition(0) == PLAYER_X && getPlayerAtPosition(3) == PLAYER_X && getPlayerAtPosition(6) == PLAYER_X) {
            return PLAYER_X;
        } else if (getPlayerAtPosition(0) == PLAYER_O && getPlayerAtPosition(3) == PLAYER_O && getPlayerAtPosition(6) == PLAYER_O) {
            return PLAYER_O;
        } else if (getPlayerAtPosition(1) == PLAYER_X && getPlayerAtPosition(4) == PLAYER_X && getPlayerAtPosition(7) == PLAYER_X) {
            return PLAYER_X;
        } else if (getPlayerAtPosition(1) == PLAYER_O && getPlayerAtPosition(4) == PLAYER_O && getPlayerAtPosition(7) == PLAYER_O) {
            return PLAYER_O;
        }
        return 0;
    }
}
