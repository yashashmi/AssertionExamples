package com.agile.CodeSamplesForAssertion;

public class BooleanSamples {

	//This could qualify for three exception tests.
	//1. Assert it for Saturday/Sunday 2. Assert it for any valid weekday
	//3. Assert it for some random string
	public boolean isWeekDay(String dayOfWeek) {

        if("Saturday".equalsIgnoreCase(dayOfWeek) || "Sunday".equalsIgnoreCase(dayOfWeek))
        {
            return false;
        } else if(("Monday".equalsIgnoreCase(dayOfWeek) || 
        		"Tuesday".equalsIgnoreCase(dayOfWeek) || 
       			"Wednesday".equalsIgnoreCase(dayOfWeek) || 
       			"Thursday".equalsIgnoreCase(dayOfWeek) || 
       			"Friday".equalsIgnoreCase(dayOfWeek))){
			return true;
		}
       return false;
		    
	}

}
