package com.kata.TictacToeTest;

import java.util.logging.Logger;

public class GameRunner {

    private static final Logger log = Logger.getLogger(GameRunner.class.getName());

    public static void main(String[] args) {
        new GameRunner().printBoard();
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
