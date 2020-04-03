package com.agile.CodeSamplesForAssertion;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EqualitySample {

	public String getWelcomeMessage(String yourName) {
		return "Welcome " + yourName;
	}

	public String getTextAppendWithRandomNumber(String someText) {

        Random random = new Random();

		return someText + random.nextInt();
	}

	public int addTwoNumbers(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public double getMaturityAmount(double principal, double interest) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        double amount = principal + (principal * interest / 100);
        
        return Double.parseDouble(decimalFormat.format(amount));
	}

	public List<String> weekendDays() {

        List<String> weekendDaysList = new ArrayList<String>();

        weekendDaysList.add("Saturday");
        weekendDaysList.add("Sunday");

		return weekendDaysList;
	}
	
}
