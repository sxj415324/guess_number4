package com.twschool.practice.api;

import com.twschool.practice.domain.GuessNumberGame;
import org.junit.Test;
import org.mockito.Mockito;

public class  GameServiceTest {
    @Test
    public void should_return_result_when_guess_number(){
        GameRepository gameRepository = Mockito.mock(GameRepository.class);
        GuessNumberGame guesssNumberGame = Mockito.mock(GuessNumberGame.class);
        Mockito.when(gameRepository.find()).thenReturn(guesssNumberGame);
        GameService gameService = new GameService(gameRepository);

        gameService.guess("1 2 3 4");

        Mockito.verify(gameRepository,Mockito.times(1)).find();
        Mockito.verify(guesssNumberGame,Mockito.times(1)).guess(Mockito.any());
    }

}
