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
			number *= -1;

		int original = number;
		int reverse = 0;
		int lastDigit = 0;

		while (number > 0) {
			lastDigit = number % 10;
			reverse *= 10;
			reverse += lastDigit;
			number /= 10;
		}

		return reverse == original;
	}
}

/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number,
otherwise it should return false.

Example Input/Output

isPalindrome(-1221); → should return true

isPalindrome(707); → should return true

isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

TIP: Logic to check a palindrome number
     Find the the reverse of the given number.
     Store it in some variable say reverse.
     Compare the number with reverse.
     If both are the the same then it is a palindrome number.

     Logic to reverse a number
     Declare and initialize another variable to store the reverse of a number.
     e.g. reverse = 0.
     Extract last digit of given number by performing the modulo division.
     Store the last digit to some variable say lastDigit = num % 10.
     Increase the place value of reverse by one.
     To increase place value multiply reverse variable by 10
     e.g. reverse = reverse * 10.
     Add lastDigit to reverse.
     Since the last digit of the number is processed,
       remove the last digit of num.
     To remove the last digit divide number by 10.
     Repeat steps until number is not equal to (or greater than) zero.

     A while loop would be good for this coding exercise.

     Be careful with negative numbers. They can also be palindrome numbers.
     Be careful with reversing a number, you will need a parameter for
     comparing a reversed number with the starting number (parameter).

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
