package com.agile.CodeSamplesForAssertion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class EqualitySampleTest {

    @Test
    public void ShouldReturnWelcomeMessage(){

        EqualitySample equalitySample = new EqualitySample();

        String result = equalitySample.getWelcomeMessage("Rudy");

        assertEquals("Welcome Rudy", result);

    }

    @Test
    public void ShouldNotReturnTextWithSpaces(){

        String someText = "SomeText";
        EqualitySample equalitySample = new EqualitySample();

        String result = equalitySample.getTextAppendWithRandomNumber(someText);
        String result1 = equalitySample.getTextAppendWithRandomNumber(someText);
        
        assertNotSame(result, result1);

    }

    @Test
    public void ShouldReturnSumOfTwoNumbers(){

        EqualitySample equalitySample = new EqualitySample();

        int sum = equalitySample.addTwoNumbers(8, 12);

        assertEquals(20, sum);

    }

    @Test
    public void ShouldReturnTheMaturityAmount(){

        EqualitySample equalitySample = new EqualitySample();

        double maturityAmount = equalitySample.getMaturityAmount(30.14, 9.34);

        assertEquals(32.95, maturityAmount, 0.01);

    }

}