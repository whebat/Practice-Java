/**
@author whebat
*/

public class Ex20_GreatestCommonDivisor
{
	public static int getGreatestCommonDivisor(int first, int second)
	{
		if (first < 10 || second < 10)
			return -1;

		int greatestCommonDivisor = 0;
		int smallerNumber = (first < second) ? first: second;
		
		for (int divisor = 2; divisor <= smallerNumber; divisor++)
			if (first % divisor == 0 && second % divisor == 0)
				greatestCommonDivisor = divisor;

		return greatestCommonDivisor;
	}
}

/*
Write a method named getGreatestCommonDivisor
with two parameters (int) first and second. 

If one of the parameters is < 10,
the method should return -1 to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).

The greatest common divisor is the largest positive integer that can fully
divide each of the integers (i.e. without leaving a remainder).

For example 12 and 30:
12 can be divided by 1, 2, 3, 4, 6, 12
30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
and there is no resulting remainder.


EXAMPLE INPUT/OUTPUT:

     getGreatestCommonDivisor
     (25, 15)  return 5 since both can be divided by 5 without a remainder
     (12, 30)  return 6 since both can be divided by 6 without a remainder
     (9, 18);  return -1 since the first parameter is < 10
     (81, 153) return 9 since both can be divided by 9 without a remainder

HINT: Use a while/for loop, to check if both numbers
      can be divided without a remainder.
      
      Find the minimum of the two numbers.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
