/**
@author whebat
*/

public class Ex10_IntEqualityPrinter
{
	public static void printEqual(int a, int b, int c)
	{
		String s = "";

		if (a < 0 || b < 0 || c < 0)
			s = "Invalid Value";

		else if (a == b && b == c)
			s = "All numbers are equal";

		else if (a != b && b != c && a != c)
			s = "All numbers are different";

		else
			s = "Neither all are equal or different";

		System.out.println(s);
	}
}

/*
*/
