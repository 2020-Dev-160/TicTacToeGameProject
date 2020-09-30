package com.kata.TictacToe;

import java.util.logging.Logger;

public class GameRunner {
    private static final Logger log = Logger.getLogger(GameRunner.class.getName());
    private final PlayerInput scanner;
    private Game game;
    public static char playerTurn = 'X';

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
                if (playerTurn == 'X')
                    playerTurn = 'O';
                else
                    playerTurn = 'X';
                if (getGameWinner())
                    break;
            }
        }
        if (game.getWinner() == 'X' || game.getWinner() == 'O') {
            log.info("congrats " + game.getWinner() + " is the winner ...!!");
        } else if (game.checkIfGameIsDraw()) {
            log.info("well played both the Players. Match is draw");
        }

    }

    private boolean getGameWinner() {
        if (game.isGameOver())
            return true;
        else
            return false;
    }

    private boolean checkForValidation(int positionNumber) {
        return game.userInputValidation(positionNumber) && game.checkPositionIsFree(positionNumber);
    }

    public void printBoard () {
        log.info("Welcome to 2 Player Tic Tac Toe.");
        log.info("--------------------------------");
        StringBuilder printInstruction=new StringBuilder("/---|---|---\\"
                +  "\n|  0 | 1 | 2|"
                +"\n------------|"
                +"\n| 3 | 4 | 5 |"
                +"\n|-----------|"
                +"\n| 6 | 7 | 8 |"
                + "\n/---|---|---|");
        System.out.println(printInstruction);
    }
}
