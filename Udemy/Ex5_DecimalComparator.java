/**
@author whebat
*/

public class Ex5_DecimalComparator
{
	public static boolean areEqualByThreeDecimalPlaces (double a, double b)
	{
		int a2 = (int) (a * 1000);
		int b2 = (int) (b * 1000);

		return (a2 == b2) ? true : false;
	}
}

/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double
numbers are the same up to three decimal places. Otherwise, return false.

EXAMPLE INPUT/OUTPUT:

     areEqualByThreeDecimalPlaces
     (-3.1756, -3.175); → true,  numbers are    equal up to 3 decimal places.
     (3.175, 3.176);    → false, numbers aren't equal up to 3 decimal places.
     (3.0, 3.0);        → true,  numbers are    equal up to 3 decimal places.
     (-3.123, 3.123);   → false, numbers aren't equal up to 3 decimal places.

TIP: Use paper and pencil, use casting.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
