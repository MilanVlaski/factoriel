package main;

public class Factorial
{

	public static long factorial(int number)
	{
		if (number < 2)
			return 1;
		else
			return number * factorial(number - 1);
	}

}
