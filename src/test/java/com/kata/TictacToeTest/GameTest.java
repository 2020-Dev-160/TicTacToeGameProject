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
    public void gameShouldReturnXonThirdTurn() {
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

    @Test
    public void gameShouldDetermineWinnerXAfterFillingFirstDiagonal() {
        game.playAtPosition(0);
        game.playAtPosition(1);
        game.playAtPosition(4);
        game.playAtPosition(2);
        game.playAtPosition(8);

        Assert.assertEquals(PLAYER_X, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerOAfterFillingFirstDiagonal() {
        game.playAtPosition(1);
        game.playAtPosition(0);
        game.playAtPosition(2);
        game.playAtPosition(4);
        game.playAtPosition(5);
        game.playAtPosition(8);

        Assert.assertEquals(PLAYER_O, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerXAfterFillingSecondDiagonal() {
        game.playAtPosition(2);
        game.playAtPosition(1);
        game.playAtPosition(4);
        game.playAtPosition(3);
        game.playAtPosition(6);

        Assert.assertEquals(PLAYER_X, game.getWinner());
    }

    @Test
    public void gameShouldDetermineWinnerOAfterFillingSecondDiagonal() {
        game.playAtPosition(1);
        game.playAtPosition(2);
        game.playAtPosition(3);
        game.playAtPosition(4);
        game.playAtPosition(5);
        game.playAtPosition(6);

        Assert.assertEquals(PLAYER_O, game.getWinner());
    }

    @Test
    public void gameIsOverWhenAllPositionOccupied() {
        game.playAtPosition(0);
        game.playAtPosition(1);
        game.playAtPosition(2);
        game.playAtPosition(3);
        game.playAtPosition(4);
        game.playAtPosition(5);
        game.playAtPosition(6);
        game.playAtPosition(7);
        game.playAtPosition(8);

        Assert.assertTrue(game.isGameOver());
    }

    @Test
    public void whenMatchIsDraw() {
        game.playAtPosition(0);
        game.playAtPosition(1);
        game.playAtPosition(2);
        game.playAtPosition(4);
        game.playAtPosition(3);
        game.playAtPosition(6);
        game.playAtPosition(5);
        game.playAtPosition(8);
        game.playAtPosition(7);

        Assert.assertTrue(game.checkIfGameIsDraw());
    }

    @Test
    public void playerInputShouldBeBetween0To8() {
        Assert.assertTrue(game.userInputValidation(0));
        Assert.assertTrue(game.userInputValidation(1));
        Assert.assertTrue(game.userInputValidation(2));
        Assert.assertTrue(game.userInputValidation(3));
        Assert.assertTrue(game.userInputValidation(4));
        Assert.assertTrue(game.userInputValidation(5));
        Assert.assertTrue(game.userInputValidation(6));
        Assert.assertTrue(game.userInputValidation(7));
        Assert.assertTrue(game.userInputValidation(8));
        Assert.assertFalse(game.userInputValidation(10));
        Assert.assertFalse(game.userInputValidation(-1));

    }

    @Test
    public void playerShouldNotPlayAtPlayedPosition() {
        Assert.assertTrue(game.checkPositionIsFree(0));
        Assert.assertTrue(game.checkPositionIsFree(1));
        Assert.assertTrue(game.checkPositionIsFree(2));
        Assert.assertTrue(game.checkPositionIsFree(3));
        Assert.assertTrue(game.checkPositionIsFree(4));
        Assert.assertTrue(game.checkPositionIsFree(5));
        Assert.assertTrue(game.checkPositionIsFree(6));
        Assert.assertTrue(game.checkPositionIsFree(7));
        Assert.assertTrue(game.checkPositionIsFree(8));
        Assert.assertFalse(game.checkPositionIsFree(8));
    }
 }