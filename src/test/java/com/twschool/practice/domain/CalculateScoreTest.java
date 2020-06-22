package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class CalculateScoreTest {
    int userTotalScores;
    @Test
    public void should_return_3_when_success_1times_and_fail_0times() {
        CalculateScore calculateScore = new CalculateScore(0,1);

        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();

        Assert.assertEquals(3, userTotalScores);
    }

    @Test
    public void should_return_0_when_success_2times_and_fail_2times() {
        CalculateScore calculateScore = new CalculateScore(2,2);

        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();

        Assert.assertEquals(0, userTotalScores);
    }

    @Test
    public void should_return_11_when_success_3times_and_fail_0times() {
        CalculateScore calculateScore = new CalculateScore(0,3);

        userTotalScores =calculateScore.calculate() + calculateScore.calculateExtra();

        Assert.assertEquals(11, userTotalScores);
    }


}
