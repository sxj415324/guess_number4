package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
    int userTotalScores;
    @Test
    public void should_return_3_when_success_1_times_and_fail_0_times() {
        //given
        GameScore gameScore = new GameScore(0,1);
        //when
        userTotalScores = gameScore.calculate() + gameScore.calculateExtra();
        //then
        Assert.assertEquals(3, userTotalScores);
    }

    @Test
    public void should_return_Negative_3_when_success_0_times_and_fail_1_times() {
        //given
        GameScore gameScore = new GameScore(1,0);
        //when
        userTotalScores = gameScore.calculate() + gameScore.calculateExtra();
        //then
        Assert.assertEquals(-3, userTotalScores);
    }

    @Test
    public void should_return_0_when_success_2_times_and_fail_2_times() {
        //given
        GameScore gameScore = new GameScore(2,2);
        //when
        userTotalScores = gameScore.calculate() + gameScore.calculateExtra();
        //then
        Assert.assertEquals(0, userTotalScores);
    }

    @Test
    public void should_return_11_when_success_3_times_and_fail_0_times() {
        //given
        GameScore gameScore = new GameScore(0,3);
        //when
        userTotalScores = gameScore.calculate() + gameScore.calculateExtra();
        //then
        Assert.assertEquals(11, userTotalScores);
    }

    @Test
    public void should_return_20_when_success_5_times_and_fail_0_times() {
        //given
        GameScore gameScore = new GameScore(0,5);
        //when
        userTotalScores = gameScore.calculate() + gameScore.calculateExtra();
        //then
        Assert.assertEquals(20, userTotalScores);
    }

    @Test
    public void should_return_25_when_success_6_times_and_fail_0_times() {
        //given
        GameScore gameScore = new GameScore(0,6);
        //when
        userTotalScores = gameScore.calculate() + gameScore.calculateExtra();
        //then
        Assert.assertEquals(25, userTotalScores);
    }

    @Test
    public void should_return_42_when_success_10_times_and_fail_0_times() {
        //given
        GameScore gameScore = new GameScore(0,10);
        //when
        userTotalScores = gameScore.calculate() + gameScore.calculateExtra();
        //then
        Assert.assertEquals(42, userTotalScores);
    }

    @Test
    public void should_return_64_when_success_15_times_and_fail_0_times() {
        //given
        GameScore gameScore = new GameScore(0,15);
        //when
        userTotalScores = gameScore.calculate() + gameScore.calculateExtra();
        //then
        Assert.assertEquals(64, userTotalScores);
    }

}
