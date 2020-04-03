package com.agile.CodeSamplesForAssertion;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BooleanSamplesTest{

    @Test
    public void ShouldReturnFalseWhenSaturday(){

        //Arrange
        BooleanSamples bs = new BooleanSamples();
        //Act
        boolean result = bs.isWeekDay("Saturday");
        //Assert
        assertFalse(result);
    }

    @Test
    public void ShouldReturnFalseWhenSunday(){

        //Arrange
        BooleanSamples bs = new BooleanSamples();
        //Act
        boolean result = bs.isWeekDay("Sunday");
        //Assert
        assertFalse(result);
    }
    @Test
    public void ShouldReturnTrueForWeekday()
        {
            //Arrange
        BooleanSamples bs = new BooleanSamples();
        //Act
        boolean result = bs.isWeekDay("Monday");
        //Assert
        assertTrue(result);
 

        }

        @Test
    public void ShouldReturnFalseWhenItIsNotANameOfADay()
        {
            //Arrange
        BooleanSamples bs = new BooleanSamples();
        //Act
        boolean result = bs.isWeekDay("dfsdf");
        //Assert
        assertFalse(result);
 

        }

}