package com.kata.TictacToe;

public class Game {
    public char getPlayerAtPosition(int positionNumber) {
        if (positionNumber == 0)
            return 'X';
        else
            return 'O';
    }
}
