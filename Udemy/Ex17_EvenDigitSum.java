/**
@author whebat
*/

public class Ex17_EvenDigitSum
{
	public static int getEvenDigitSum(int number)
	{
		if (number < 0)
			return -1;

		int evenDigit = 0;
		int lastDigit = 0;
		int sum = 0;

		while (number > 0) {
			lastDigit = number % 10;
			number /= 10;

			if (lastDigit % 2 == 0) // Even number.
				sum += lastDigit;
		}

		return sum;
	}
}

/*
Write a method named getEvenDigitSum with a parameter (int) called number.

The method should return the sum of the even digits within the number.
If the number is negative, return -1 to indicate an invalid value.


EXAMPLE INPUT/OUTPUT:

     getEvenDigitSum(123456789)  should return 20 since 2 + 4 + 6 + 8 = 20
     getEvenDigitSum(252)        should return 4 since 2 + 2 = 4
     getEvenDigitSum(-22)        should return -1 since the number is negative.


NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
