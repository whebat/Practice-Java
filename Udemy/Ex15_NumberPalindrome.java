/**
@author whebat
*/

public class Ex15_NumberPalindrome
{
	public static boolean isPalindrome(int number)
	{
		if (number >= 0 && number < 10)
			return true;

		if (number < 0)
			number = number * (-1);

		int original = number;
		int reverse = 0;
		int lastDigit = 0;

		while (number > 0) {
			lastDigit = number % 10;
			reverse = reverse * 10;
			reverse = reverse + lastDigit;
			number = number / 10;
		}

		return (reverse == original) ? true : false;
	}
}

/*
*/
