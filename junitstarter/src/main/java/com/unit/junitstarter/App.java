package com.unit.junitstarter;

/**
 * Hello world!
 *
 */
public class App 
{
	int divideNumbers(int firstNum, int secondNum) {
		return firstNum / secondNum;

	}

	boolean checkForPalindrome(String value) {
		if (value.equals("madam"))
			return true;
		else
			return false;
	}

	App getObjectValue() {
		return null;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

interface Greeting{
	String message="Hello how are you?";
	String displayGreeting();
}
