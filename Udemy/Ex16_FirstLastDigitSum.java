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
Write a method named sumFirstAndLastDigit with a parameter (int) called number.

The method needs to find the first and the last digit of the parameter number
passed to the method, using a loop and return the sum of the first and the
last digit of that number. If the number is negative then the method needs
to return -1 to indicate an invalid value.

EXAMPLE INPUT/OUTPUT:

     sumFirstAndLastDigit

     (252) return 4,  the first digit is 2 and the last is 2,
                      which gives us 2+2 and the sum is 4.

     (257) return 9,  the first digit is 2 and the last is 7,
                      which gives us 2+7 and the sum is 9.

     (0)   return 0,  the first digit and the last digit is 0,
                      since we only have 1 digit,
                      which gives us 0+0 and the sum is 0.

     (5)   return 10, the first digit and the last digit is 5,
                      since we only have 1 digit,
                      which gives us 5+5 and the sum is 10.

     (-10) return -1, since the parameter is negative and needs to be positive.


NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
