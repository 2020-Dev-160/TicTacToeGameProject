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
    public void gameShouldReturnOonSecondTurn() {
        game.playAtPosition(0);
        game.playAtPosition(1);

        Assert.assertEquals(PLAYER_O, game.getPlayerAtPosition(1));
    }

    @Test
    public void gameshouldReturnXonThirdTurn() {
        game.playAtPosition(0);
        game.playAtPosition(1);
        game.playAtPosition(2);

        Assert.assertEquals(PLAYER_X, game.getPlayerAtPosition(2));
    }

    @Test
    public void gameShouldDetermineWinnerXAfterFillingFirstColumn() {
        game.playAtPosition(0);
        game.playAtPosition(1);
        game.playAtPosition(3);
        game.playAtPosition(2);
        game.playAtPosition(6);

        Assert.assertEquals(PLAYER_X, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerOAfterFillingFirstColumn() {
        game.playAtPosition(1);
        game.playAtPosition(0);
        game.playAtPosition(2);
        game.playAtPosition(3);
        game.playAtPosition(4);
        game.playAtPosition(6);

        Assert.assertEquals(PLAYER_O, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerXAfterFillingSecondColumn() {
        game.playAtPosition(1);
        game.playAtPosition(0);
        game.playAtPosition(4);
        game.playAtPosition(2);
        game.playAtPosition(7);

        Assert.assertEquals(PLAYER_X, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerOAfterFillingSecondColumn() {
        game.playAtPosition(0);
        game.playAtPosition(1);
        game.playAtPosition(2);
        game.playAtPosition(4);
        game.playAtPosition(5);
        game.playAtPosition(7);

        Assert.assertEquals(PLAYER_O, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerXAfterFillingThirdColumn() {
        game.playAtPosition(2);
        game.playAtPosition(0);
        game.playAtPosition(5);
        game.playAtPosition(1);
        game.playAtPosition(8);

        Assert.assertEquals(PLAYER_X, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerOAfterFillingThirdColumn() {
        game.playAtPosition(0);
        game.playAtPosition(2);
        game.playAtPosition(1);
        game.playAtPosition(5);
        game.playAtPosition(3);
        game.playAtPosition(8);

        Assert.assertEquals(PLAYER_O, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerXAfterFillingFirstRow() {
        game.playAtPosition(0);
        game.playAtPosition(3);
        game.playAtPosition(1);
        game.playAtPosition(4);
        game.playAtPosition(2);

        Assert.assertEquals(PLAYER_X, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerOAfterFillingFirstRow() {
        game.playAtPosition(3);
        game.playAtPosition(0);
        game.playAtPosition(4);
        game.playAtPosition(1);
        game.playAtPosition(6);
        game.playAtPosition(2);

        Assert.assertEquals(PLAYER_O, game.getWinner());
    }
    @Test
    public void gameShouldDetermineWinnerXAfterFillingSecondRow() {
        game.playAtPosition(3);
        game.playAtPosition(1);
        game.playAtPosition(4);
        game.playAtPosition(2);
        game.playAtPosition(5);

        Assert.assertEquals(PLAYER_X, game.getWinner());
    }
    @Test
    public void gameShouldDetermineWinnerOAfterFillingSecondRow() {
        game.playAtPosition(0);
        game.playAtPosition(3);
        game.playAtPosition(1);
        game.playAtPosition(4);
        game.playAtPosition(7);
        game.playAtPosition(5);

        Assert.assertEquals(PLAYER_O, game.getWinner());
    }
    @Test
    public void gameShouldDetermineWinnerXAfterFillingThirdRow() {
        game.playAtPosition(6);
        game.playAtPosition(1);
        game.playAtPosition(7);
        game.playAtPosition(2);
        game.playAtPosition(8);

        Assert.assertEquals(PLAYER_X, game.getWinner());
    }
    @Test
    public void gameShouldDetermineWinnerOAfterFillingThirdRow() {
        game.playAtPosition(0);
        game.playAtPosition(6);
        game.playAtPosition(1);
        game.playAtPosition(7);
        game.playAtPosition(3);
        game.playAtPosition(8);

        Assert.assertEquals(PLAYER_O, game.getWinner());
    }

}
