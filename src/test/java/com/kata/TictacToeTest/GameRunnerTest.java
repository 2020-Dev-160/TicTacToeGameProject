package com.kata.TictacToeTest;

import com.kata.TictacToe.Game;
import com.kata.TictacToe.GameRunner;
import com.kata.TictacToe.PlayerInput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameRunnerTest {

    @Mock
    private Game game;
    @Mock
    private PlayerInput scanner;

    @InjectMocks
    private GameRunner gameRunner;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void verifyIfScannerIsCalledOnceToGetTheFirstInput() {
        when(scanner.nextLine()).thenReturn(1);
        when(game.isGameNotOver()).thenReturn(true, false);

        gameRunner.beginTheGame();

        verify(scanner, Mockito.times(1)).nextLine();
    }

    @Test
    public void verifyIfScannerIsCalledTwiceToGetTheTwoInput() {
        when(scanner.nextLine()).thenReturn(1, 2);
        when(game.isGameNotOver()).thenReturn(true, true, false);
        gameRunner.beginTheGame();

        verify(scanner, Mockito.times(2)).nextLine();
    }
}