/**
@author whebat
*/

public class Ex16_FirstLastDigitSum
{
	public static int sumFirstAndLastDigit(int number)
	{
		if (number < 0)
			return -1;

		int firstDigit = 0; // must be defined outside of loop
		int lastDigit = number % 10;

		// finding the first digit
		while (number > 0) {
			firstDigit = number % 10;
			number /= 10;
		}

		return lastDigit + firstDigit;
	}
}

/*
*/
