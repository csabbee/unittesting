package com.epam.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class BasicJUnitExampleTest {
    private BasicJUnitExample basicjunitexample;
    
    @Before
    public void setUp(){
        basicjunitexample = new BasicJUnitExample();
    }
    
    @Test
    public void testUltimateAnswer(){
        //GIVEN
        Integer expected = Integer.valueOf(42);
        //WHEN
        Integer result = basicjunitexample.ultimateAnswer();
        //THEN
        Assert.assertEquals(expected, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBadAnswerShouldThrowExceptionWhenInputEqualsUltimateAnswer(){
        //GIVEN
        Integer input = Integer.valueOf(42);
        //THEN
        basicjunitexample.badAnswer(input);
    }
    
    @Test
    public void testBadAnswerShouldNotThrowExceptionWhenInputDoesNotEqualsUltimateAnswer(){
        //GIVEN
        Integer input = Integer.valueOf(41);
        //WHEN
        Integer result = basicjunitexample.badAnswer(input);
        //THEN
        Assert.assertEquals(input, result);
    }
    @Test
    public void isTheUltimateAnswerWhenInputEqualsUltimateAnswer(){
        //GIVEN
        Integer input = Integer.valueOf(42);
        //WHEN
        Boolean result = basicjunitexample.isTheUltimateAnswer(input);
        //THEN
        Assert.assertEquals(result, Boolean.TRUE);
    }
    
    @Test
    public void isTheUltimateAnswerWhenInputDoesNotEqualUltimateAnswer(){
        //GIVEN
        Integer input = Integer.valueOf(41);
        //WHEN
        Boolean result = basicjunitexample.isTheUltimateAnswer(input);
        //THEN
        Assert.assertEquals(result, Boolean.FALSE);
    }
}
