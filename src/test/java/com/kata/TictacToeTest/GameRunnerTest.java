package com.kata.TictacToeTest;

import com.kata.TictacToe.GameRunner;
import com.kata.TictacToe.PlayerInput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class GameRunnerTest {

    @Mock
    private GameTest gameTest;
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
    }
    @Test
    public void verifyIfScannerIsCalledTwiceToGetTheTwoInput(){
        when(scanner.nextLine()).thenReturn(1, 2);
    }
}