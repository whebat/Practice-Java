/**
@author whebat
*/

public class Ex19_LastDigitChecker
{
	public static boolean hasSameLastDigit(int a, int b, int c)
	{
		if ( (!isValid(a)) || (!isValid(b)) || (!isValid(c)) )
			return false;

		int lasta = a % 10;
		int lastb = b % 10;
		int lastc = c % 10;

		if (lasta == lastb || lastb == lastc || lasta == lastc)
			return true;
		else
			return false;
	}

	public static boolean isValid(int d)
	{
		return (d < 10 || d > 1000) ? false : true;
	}
}

/*
Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share
the same rightmost digit. Otherwise, it should return false.


EXAMPLE INPUT/OUTPUT:

     hasSameLastDigit
     (41, 22, 71)      true, 1 is the rightmost digit in numbers 41 and 71
     (23, 32, 42)      true since 2 is the rightmost digit in numbers 32 and 42
     (9, 99, 999)      false since 9 is not within the range of 10-1000


Write another method named isValid with one parameter of type int.

The method needs to return true if the number parameter is in
range of 10(inclusive) - 1000(inclusive). Otherwise return false.

EXAMPLE INPUT/OUTPUT

     isValid(10)   true since 10 is within the range of 10-1000
     isValid(468)  true since 468 is within the range of 10-1000
     isValid(1051) false since 1051 is not within the range of 10-1000

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
