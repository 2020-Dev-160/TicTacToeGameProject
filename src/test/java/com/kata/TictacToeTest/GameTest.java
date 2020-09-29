package com.kata.TictacToeTest;

import com.kata.TictacToe.Game;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void gameShouldReturnXOnFirstTurn() {
        Game game = new Game();
        Assert.assertEquals('X', game.getPlayerAtPosition(0));
    }

}
