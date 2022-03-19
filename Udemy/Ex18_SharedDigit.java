/**
@author whebat
*/

public class Ex18_SharedDigit
{
	public static boolean hasSharedDigit(int y, int z)
	{
		if (y < 10 || y > 99 || z < 10 || z > 99)
			return false;

		// Finding both digits of y.
		int y1st = y % 10;
		int y2nd = (y / 10) % 10;

		// Finding both digits of z.
		int z1st = z % 10;
		int z2nd = (z / 10) % 10;

		if (y1st == z1st ||
		    y1st == z2nd ||
		    y2nd == z1st ||
		    y2nd == z2nd)
			return true;

		else
			return false;
	}
}

/*
Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:

     hasSharedDigit
     (12, 23)  return true since the digit 2 appears in both numbers.
     (9, 99)   return false since 9 is not within the range of 10-99.
     (15, 55)  return true since the digit 5 appears in both numbers.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
