package com.kata.TictacToeTest;

import com.kata.TictacToe.Game;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    private Game game;

    @Before
    public void init() {
        game = new Game();
    }

    @Test
    public void gameShouldReturnXOnFirstTurn() {
        game.playAtPosition(0);

        Assert.assertEquals(PLAYER_X, game.getPlayerAtPosition(0));
    }

    @Test
    public void gameShouldReturnOonSecondTurn(){
        game.playAtPosition(0);
        game.playAtPosition(1);

        Assert.assertEquals(PLAYER_O,game.getPlayerAtPosition(1));
    }
}
