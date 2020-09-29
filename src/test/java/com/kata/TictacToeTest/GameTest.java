package com.kata.TictacToeTest;

import com.kata.TictacToe.Game;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game game;
    @Before
    public void init() {
        game = new Game();
    }

    @Test
    public void gameShouldReturnXOnFirstTurn() {
        Assert.assertEquals('X', game.getPlayerAtPosition(0));
    }
    @Test
    public void gameShouldReturnOonSecondTurn(){
        Assert.assertEquals('O',game.getPlayerAtPosition(1));
    }
}
