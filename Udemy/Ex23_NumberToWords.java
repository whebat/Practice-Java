/**
@author whebat
*/

public class Ex23_NumberToWords
{
	public static void numberToWords(int number)
	{
		if (number < 0)
			System.out.println("Invalid Value");

		else if (number == 0)
			System.out.println("Zero");

		else {
			// Two new variables to check for leading zeroes.
			int dNum = getDigitCount(number);
			number = reverse(number);
			int dRev = getDigitCount(number);

			for (; number > 0; number /= 10) {

				if (number % 10 == 1)
					System.out.print("One");
				else if (number % 10 == 2)
					System.out.print("Two");
				else if (number % 10 == 3)
					System.out.print("Three");
				else if (number % 10 == 4)
					System.out.print("Four");
				else if (number % 10 == 5)
					System.out.print("Five");
				else if (number % 10 == 6)
					System.out.print("Six");
				else if (number % 10 == 7)
					System.out.print("Seven");
				else if (number % 10 == 8)
					System.out.print("Eight");
				else if (number % 10 == 9)
					System.out.print("Nine");
				else
					System.out.print("Zero");

				if (number / 10 != 0)
					System.out.print(" ");

			} // End for loop.

			for (int diff = dNum - dRev; diff > 0; diff--)
				System.out.print(" Zero"); // Leading zeroes.

			System.out.println();

		} // End else.
	}

	public static int reverse(int number)
	{
		int reverse = 0;

		for (; number != 0; number /= 10)
			reverse = reverse * 10 + number % 10;

		return reverse;
	}

	public static int getDigitCount(int number)
	{
		if (number <= 0)
			return (number == 0) ? 1 : -1;

		int digit = 0;

		for (; number > 0; digit++)
			number /= 10;

		return digit;
	}
}

/*
Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".

To print the number as words, follow these steps:

     1. Extract last digit of the given number using the remainder operator.
     
     2. Convert the value of the digit found in Step 1 into a word.
        There are 10 possible values for that digit, those being 0 to 9.
        Print the corresponding word for each digit,
        e.g. print "Zero" if the digit is 0,
        "One" if the digit is 1, and so on.
        
     3. Remove the last digit from the number.
     
     4. Repeat Steps 2 through 4 until the number is 0.

The logic above is correct, but in its current state, the words will be
printed in reverse order. For example, if the number is 234, the logic
above will produce the output "Four Three Two" instead of "Two Three Four".
To overcome this problem, write a second method called reverse, which
should also reverse negative numbers.

Use reverse() within numberToWords() to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes,
(e.g. the reversed number for 100 is 001).
The logic above for numberToWords() will print "One", but that is incorrect.
It should print "One Zero Zero".
To solve this problem, write a third method called getDigitCount.

The method getDigitCount should have one int parameter called number,
and return the count of the digits in that number.
If the number is negative, return -1 to indicate an invalid value.
e.g. if the number has a value of 100, the method getDigitCount
should return 3 since the number 100 has 3 digits (1, 0, 0).


EXAMPLE INPUT/OUTPUT (getDigitCount):

     (0)    should return 1 since there is only 1 digit
     (123)  should return 3
     (-12)  should return -1 since the parameter is negative
     (5200) should return 4 since there are 4 digits in the number


EXAMPLE INPUT/OUTPUT (reverse):

     (-121) should return -121
     (1212) should return 2121
     (1234) should return 4321
     (100)  should return 1


EXAMPLE INPUT/OUTPUT (numberToWords):

     (123)  should print "One Two Three".
     (1010) should print "One Zero One Zero".
     (1000) should print "One Zero Zero Zero".
     (-12)  should print "Invalid Value" since the parameter is negative.


HINT: Use a for loop to print zeroes after reversing the number.
      As seen in a previous example, 100 reversed becomes 1,
      but the method numberToWords should print "One Zero Zero".
     
      To get the number of zeroes, check the difference between
      the digit count from the original number and the reversed number. 

NOTE: When printing words, each word can be in its own line.
      
      For example, numberToWords(123); can be:
      One
      Two
      Three
      
      They don't have to be separated by a space.

      All 3 methods need to be defined as public static.
      Do not add a main method to solution code.
*/
