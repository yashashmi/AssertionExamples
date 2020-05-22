package com.agile.CodeSamplesForAssertion;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BooleanSamplesTest{

    static BooleanSamples bs = null;

    static int num =0;

    @BeforeClass
    public static void class_level_setup() {
        System.out.println("BeforeClass from boolean");
        bs = new BooleanSamples();
    }

    @AfterClass
    public static void class_level_teardown() {
        System.out.println("AfterClass from boolean");
        bs = null;
    }

    @Before
    public void setup() {
        System.out.println("Before from boolean");
        
        num = 5;
    }

    @After
    public void teardown() {
        System.out.println("After from boolean");
        
    }

    @Test
    public void ShouldReturnFalseWhenSaturday(){

        //Arrange
        // BooleanSamples bs = new BooleanSamples();
        //Act
        boolean result = bs.isWeekDay("Saturday");
        //Assert
        assertFalse(result);
    }

    @Test
    public void ShouldReturnFalseWhenSunday(){

        //Arrange
        // BooleanSamples bs = new BooleanSamples();
        //Act
        boolean result = bs.isWeekDay("Sunday");
        //Assert
        assertFalse(result);
    }

    @Test
    public void test1() {

        num++;

        int sum = 3 + num;

        assertEquals(9, sum);

    }
    
    // If before is not called then below TEST will fail
    @Test
    public void test2() {

        num++;

        int sum = 3 + num;

        assertEquals(9, sum);

    }

}