/**
@author whebat
*/

public class Ex07_TeenNumberChecker
{
	public static boolean hasTeen(int ageA, int ageB, int ageC)
	{
		return isTeen(ageA) || isTeen(ageB) || isTeen(ageC);
	}

	public static boolean isTeen(int age)
	{
		return age >= 13 && age <= 19;
	}
}

/*
We'll say that a number is "teen" if it's in the range of 13 to 19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if
one of the parameters is in the range of "teen". Otherwise return false.


EXAMPLE INPUT/OUTPUT:

     hasTeen
     (9, 99, 19);  true  since 19 is in range 13 - 19.
     (23, 15, 42); true  since 15 is in range 13 - 19.
     (22, 23, 34); false since numbers 22, 23, 34 are not in range 13 - 19.


Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if
the parameter is in the range of "teen". Otherwise return false.

EXAMPLE INPUT/OUTPUT:

     isTeen(9);  false since 9  is not in range 13 - 19.
     isTeen(13); true  since 13 is     in range 13 - 19.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
