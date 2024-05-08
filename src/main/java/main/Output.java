package main;

import static main.Factorial.factorial;

public class Output
{

	public static String solveFactorial(int number)
	{
		if (number < 0)
			return number + " is not a positive integer.\nPlease try a positive integer.";
		else
			return number + "! equals " + factorial(number);
	}

	public static String accept(String string)
	{
		try
		{
			Integer intOfString = Integer.valueOf(string);
			return solveFactorial(intOfString);
		} catch (NumberFormatException e)
		{
			return "Input invalid. Try a positive integer instead.";
		}
	}

}
