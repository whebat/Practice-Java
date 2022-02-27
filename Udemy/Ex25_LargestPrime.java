/**
@author whebat
*/

public class Ex25_LargestPrime
{
	public static int getLargestPrime(int number)
	{
		if (number <= 1)
			return -1;

		int prime = 2;

		for (; prime <= number; prime++)
			if (number % prime == 0)
				number /= prime--;

		return prime;
	}
}

/*
Write a method (getLargestPrime) with 1 param (int) named number.

If the number is negative or does not have any prime numbers,
the method should return -1 to indicate an invalid value.

The method should calculate the largest prime factor
of a given number and return it.


EXAMPLE INPUT/OUTPUT:

     getLargestPrime
     (21)  should return 7:  7 is the largest prime (3 * 7 = 21)
     (217) should return 31: 31 is the largest prime (7 * 31 = 217)
     (0)   should return -1: 0 does not have any prime numbers
     (45)  should return 5:  5 is the largest prime (3 * 3 * 5 = 45)
     (-1)  should return -1: the parameter is negative


HINT: Since 0 and 1 aren't prime numbers, they can't contain prime numbers.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
