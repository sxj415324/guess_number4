package com.twschool.practice.api;

import com.twschool.practice.domain.GuessNumberGame;

public class GameService {
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    public String guess(String userAnswerString){
        GuessNumberGame guessNumberGame = gameRepository.find();
        return guessNumberGame.guess(userAnswerString);
    }
}
