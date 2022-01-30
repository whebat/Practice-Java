/**
@author whebat
*/

public class Ex14_SumOddRange
{
	public static boolean isOdd(int number)
	{
		if (number < 0)
			return false;
		else
			return (number % 2 == 0) ? false : true; // even : odd;
	}

	public static int sumOdd(int start, int end)
	{
		 if (start < 0 || end < 0 || end < start)
			 return -1;

		 int sum = 0;

		 for (int i = start; i <= end; i++)
			 sum = (isOdd(i)) ? sum + i : sum;

		 return sum;
	}
}

/*
*/
