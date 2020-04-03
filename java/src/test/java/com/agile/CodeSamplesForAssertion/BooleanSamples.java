package com.agile.CodeSamplesForAssertion;

public class BooleanSamples {

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
