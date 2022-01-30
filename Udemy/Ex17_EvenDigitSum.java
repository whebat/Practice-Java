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
*/
