package com.agile.CodeSamplesForAssertion;

import java.text.DecimalFormat;
import java.util.Random;

public class EqualitySample {

	public String getWelcomeMessage() {
		return null;
	}

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

}
