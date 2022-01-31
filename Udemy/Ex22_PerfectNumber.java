/**
@author whebat
*/

public class Ex22_PerfectNumber
{
	public static boolean isPerfectNumber(int number)
	{
		if (number < 1)
			return false;

		int sum = 0;

		for (int i = 1; i <= number; i++)
			if (number % i == 0)
			    sum += i;

		return (sum == number * 2) ? true : false;
	}
}

/*
A perfect number is a positive integer which is
equal to the sum of its proper positive divisors.

Proper positive divisors are positive integers that fully divide the perfect
number without leaving a remainder and exclude the perfect number itself.

For example, take the number 6:
Its proper divisors are 1, 2, and 3.
Since 6 is the value of the perfect number, it is excluded.
The sum of its proper divisors is 1 + 2 + 3 = 6. 
Therefore, 6 is a perfect number (as well as the first perfect number).

Write a method named isPerfectNumber with one parameter (int) named number. 

If number is < 1, the method should return false.

The method must calculate if the number is perfect.
If the number is perfect, the method should return true.
Otherwise, it should return false.


EXAMPLE INPUT/OUTPUT:

     isPerfectNumber
     (6)  true, its proper divisors and sum are 1 + 2 + 3 = 6
     (28) true, its proper divisors and sum are 1 + 2 + 4 + 7 + 14 = 28
     (5)  false, its only proper divisor is 1 and the sum is 1 not 5
     (-1) false, the number is < 1

HINT: Use a while or for loop.
      Use the remainder operator.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
