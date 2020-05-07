package com.agile.CodeSamplesForAssertion;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EqualitySampleTest {

    @Test
    public void ShouldReturnWelcomeMessage(){

        EqualitySample equalitySample = new EqualitySample();

        String result = equalitySample.getWelcomeMessage("Rudy");

        assertEquals("Welcome Rudy", result);

        //OR
        //The new way of Assertion for which dependencies needs to be imported in pom.xml:
        assertThat(result, is("Welcome Rudy"));

    }

    @Test
    public void ShouldNotReturnSameText(){
        
        String someText = "SomeText";
        EqualitySample equalitySample = new EqualitySample();

        String result = equalitySample.getTextAppendWithRandomNumber(someText);
        String result1 = equalitySample.getTextAppendWithRandomNumber(someText);
        
        assertNotSame(result, result1);

        //OR
        //The new way of Assertion for which dependencies needs to be imported in pom.xml:
        assertThat(result, is(not(result1)));

    }

    @Test
    public void ShouldReturnSumOfTwoNumbers(){

        EqualitySample equalitySample = new EqualitySample();

        int sum = equalitySample.addTwoNumbers(8, 12);

        assertEquals(20, sum);

        //OR
        //The new way of Assertion for which dependencies needs to be imported in pom.xml:
        assertThat(20, is(equalTo(sum)));

    }

    @Test
    public void ShouldReturnTheMaturityAmount(){

        EqualitySample equalitySample = new EqualitySample();

        double maturityAmount = equalitySample.getMaturityAmount(30.14, 9.34);

        assertEquals(32.95, maturityAmount, 0.01);

        //OR
        //The new way of Assertion for which dependencies needs to be imported in pom.xml:
        assertThat(32.95, closeTo(maturityAmount, 0.01));

    }

    @Test
    public void ShouldNotReturnNullWeekendDaysList(){

        EqualitySample equalitySample = new EqualitySample();

        List<String> weekendDaysList = equalitySample.weekendDays();

        assertNotNull(weekendDaysList);

        //OR
        //The new ways of Assertion for which dependencies needs to be imported in pom.xml:
        assertThat(weekendDaysList.isEmpty(), is(false));

        assertThat(weekendDaysList, is(not(empty())));
    }

    @Test
    public void ShouldNotReturnEmptyWeekendDaysList(){

        EqualitySample equalitySample = new EqualitySample();

        List<String> weekendDaysList = equalitySample.weekendDays();

        assertEquals(2, weekendDaysList.size());

        //OR
        //The new ways of Assertion for which dependencies needs to be imported in pom.xml:
        assertThat(2, is(weekendDaysList.size()));
    }

    @Test
    public void ShouldReturnWeekendDaysListAsExpected(){

        EqualitySample equalitySample = new EqualitySample();

        List<String> weekendDaysListLocal = new ArrayList<String>();
        weekendDaysListLocal.add("Saturday");
        weekendDaysListLocal.add("Sunday");

        List<String> weekendDaysList = equalitySample.weekendDays();

        assertEquals(weekendDaysListLocal, weekendDaysList);
    
        //OR
        //The new ways of Assertion for which dependencies needs to be imported in pom.xml:
        //Dont need to create weekendDaysListLocal if we use below approach 
        assertThat(weekendDaysList, containsInAnyOrder("Saturday", "Sunday"));
        
    }

    @Test
    public void shouldReturnNotSameWhenValuesHaveDifferentColors(){
         
        EqualitySample equalitySample = new EqualitySample();
        assertNotSame(equalitySample.getColorValue("key1"), equalitySample.getColorValue("key2"));
    }

    @Test
    public void testArrayEquals(){

        EqualitySample equalitySample = new EqualitySample();
        String[] result =  equalitySample.getFruitArray();
		String[] expectedFruitsArray = {"apple", "mango", "grape"};
        assertArrayEquals(expectedFruitsArray, result);
    
    }
    

}