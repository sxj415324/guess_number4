package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class CalculateScoreTest {
    int userTotalScores;
    @Test
    public void should_return_3_when_success_1times_and_fail_0times() {
        //given
        CalculateScore calculateScore = new CalculateScore(0,1);
        //when
        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();
        //then
        Assert.assertEquals(3, userTotalScores);
    }

    @Test
    public void should_return_0_when_success_2times_and_fail_2times() {
        //given
        CalculateScore calculateScore = new CalculateScore(2,2);
        //when
        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();
        //then
        Assert.assertEquals(0, userTotalScores);
    }

    @Test
    public void should_return_11_when_success_3times_and_fail_0times() {
        //given
        CalculateScore calculateScore = new CalculateScore(0,3);
        //when
        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();
        //then
        Assert.assertEquals(11, userTotalScores);
    }

    @Test
    public void should_return_20_when_success_5times_and_fail_0times() {
        //given
        CalculateScore calculateScore = new CalculateScore(0,5);
        //when
        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();
        //then
        Assert.assertEquals(20, userTotalScores);
    }

    @Test
    public void should_return_25_when_success_6times_and_fail_0times() {
        //given
        CalculateScore calculateScore = new CalculateScore(0,6);
        //when
        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();
        //then
        Assert.assertEquals(25, userTotalScores);
    }

}
