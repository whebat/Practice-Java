/**
@author whebat
*/

public class Ex14_SumOddRange
{
	public static boolean isOdd(int number)
	{
		return number < 0 ? false : number % 2 != 0;
	}

	public static int sumOdd(int start, int end)
	{
		 if (start < 0 || end < 0 || end < start)
			 return -1;

		 int sum = 0;

		 for (int i = start; i <= end; i++)
			 if (isOdd(i))
				sum += i;

		 return sum;
	}
}

/*
Write a method called isOdd with an int parameter and call it number.
The method needs to return a boolean.

Check that number is > 0, if it is not return false.
If number is odd return true, otherwise  return false.

Write a second method called sumOdd that has 2 int parameters
start and end, which represent a range of numbers.

The method should use a for loop to sum all odd numbers in that range
including the end and return the sum. It should call the method isOdd
to check if each number is odd.

The parameter end needs to be greater than or equal to start and both
start and end parameters have to be greater than 0. If those conditions
are not satisfied return -1 from the method to indicate invalid input.

EXAMPLE INPUT/OUTPUT:

     sumOdd
     (1, 100)     return 2500
     (-1, 100)    return -1
     (100, 100)   return 0
     (13, 13)     return 13 (This set contains one number, 13, and it is odd)
     (100, -100)  return -1
     (100, 1000)  return 247500

TIP: Use the remainder operator to check if the number is odd.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
