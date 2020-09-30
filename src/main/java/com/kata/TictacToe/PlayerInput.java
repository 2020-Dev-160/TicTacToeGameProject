package com.kata.TictacToe;

import java.util.Scanner;

public class PlayerInput {
    public static final Scanner SCANNER = new Scanner(System.in);

    public int nextLine() {
        return Integer.parseInt(SCANNER.nextLine());
    }
}