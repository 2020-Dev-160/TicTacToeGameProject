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
            log.info("Player "+ playerTurn + " turn: enter position number (0 to 8) :");
            int positionNumber = scanner.nextLine();
                if (playerTurn == 'X')
                    playerTurn = 'O';
                else
                    playerTurn = 'X';
                if(getGameWinner())
                    break;
        }
        if (game.getWinner() == 'X' || game.getWinner() == 'O')
            log.info("congrats "+ Game.winner + " is the winner ...!!");
        else {
            log.info("well played both the Players. Match is draw");
        }
    }
    private boolean getGameWinner() {
        if (game.isGameOver())
            return true;
        else
            return false;
    }


    public void printBoard() {
        log.info("Welcome to 2 Player Tic Tac Toe.");
        log.info("--------------------------------");
        System.out.println("/---|---|---\\");
        System.out.println("|  0 | 1 | 2 |");
        System.out.println("|-----------|");
        System.out.println("| 3 | 4 | 5 |");
        System.out.println("|-----------|");
        System.out.println("| 6 | 7 | 8 |");
        System.out.println("/---|---|---\\");
    }
}
