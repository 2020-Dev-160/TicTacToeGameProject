package com.kata.TictacToe;

import java.util.logging.Logger;

import static com.kata.TictacToe.GameConstant.*;

public class Game {
    char previousPlayer;
    char[] board = new char[9];
    private static final Logger log = Logger.getLogger(Game.class.getName());

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

    public boolean checkIfGameIsDraw() {
        boolean isDraw = false;
        for (int positionNumber = 0; positionNumber < 9; positionNumber++) {
            if (board[positionNumber] == '\0')
                 break;
            else if (positionNumber == 8) {
                isDraw = true;
            }
        }
        return isDraw;
    }

    public boolean userInputValidation(int positionNumber) {
        boolean isValid=true;
        if (positionNumber < 0 || positionNumber > 8) {
            log.warning("Invalid input re-enter position number....");
            isValid=false;
        }
            return isValid;
    }

    public boolean checkPositionIsFree(int positionNumber) {
        boolean isFree=true;
        if (board[positionNumber] == '\0') {
            playAtPosition(positionNumber);
        } else {
            log.warning("Slot already taken; re-enter slot number: ");
            isFree=false;
        }
        return isFree;
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

    public boolean isGameNotOver() {
        return !isGameOver();
    }

    public boolean isGameOver() {
        return getWinner() == 'X' || getWinner() == 'O' || checkIfGameIsDraw();
    }
}
