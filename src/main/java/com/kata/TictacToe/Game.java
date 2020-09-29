package com.kata.TictacToe;

public class Game {
    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    char previousPlayer;
    char[] board = new char[9];

    public char getPlayerAtPosition(int positionNumber) {
        return board[positionNumber];
    }

    public void playAtPosition(int positionNumber) {
        char currentPlayer = previousPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
        board[positionNumber] = currentPlayer;
        previousPlayer = currentPlayer;
    }
}
