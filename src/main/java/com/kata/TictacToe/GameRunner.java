package com.kata.TictacToe;

import java.util.logging.Logger;

import static com.kata.TictacToe.GameConstant.PLAYER_O;
import static com.kata.TictacToe.GameConstant.PLAYER_X;

public class GameRunner {
    private static final Logger log = Logger.getLogger(GameRunner.class.getName());
    private final PlayerInput scanner;
    private final Game game;
    public static char playerTurn = PLAYER_X;

    public GameRunner(PlayerInput scanner, Game game) {
        this.scanner = scanner;
        this.game = game;
    }

    public GameRunner() {
        this(new PlayerInput(), new Game());
    }

    public static void main(String[] args) {
        new GameRunner().beginTheGame();
    }

    public void beginTheGame() {
        printBoard();
        startGame();
    }

    private void startGame() {
        while (game.isGameNotOver()) {
            log.info("Player " + playerTurn + " turn: enter position number (0 to 8) :");
            int positionNumber = scanner.nextLine();
            if (checkForValidation(positionNumber)) {
                if (playerTurn == PLAYER_X)
                    playerTurn = PLAYER_O;
                else
                    playerTurn = PLAYER_X;
                if (getGameWinner())
                    break;
            }
        }
        if (game.getWinner() == PLAYER_X || game.getWinner() == PLAYER_O) {
            log.info("congrats " + game.getWinner() + " is the winner ...!!");
        } else if (game.checkIfGameIsDraw()) {
            log.info("well played both the Players. Match is draw");
        }

    }

    private boolean getGameWinner() {
        return game.isGameOver();
    }

    private boolean checkForValidation(int positionNumber) {
        return game.userInputValidation(positionNumber) && game.checkPositionIsFree(positionNumber);
    }

    public void printBoard() {
        log.info("Welcome to 2 Player Tic Tac Toe.");
        log.info("--------------------------------");
        String printInstruction = "/---|---|---\\" +
                "\n|  0 | 1 | 2|" +
                "\n------------|" +
                "\n| 3 | 4 | 5 |" +
                "\n|-----------|" +
                "\n| 6 | 7 | 8 |" +
                "\n/---|---|---|\"";
        log.info(printInstruction);
    }
}
