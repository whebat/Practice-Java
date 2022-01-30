/**
@author whebat
*/

public class Ex10_IntEqualityPrinter
{
	public static void printEqual(int a, int b, int c)
	{
		String s;

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
Write a method printEqual with 3 parameters of type int.
The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".


EXAMPLE INPUT/OUTPUT:

     printEqual(1, 1, 1)     print text "All numbers are equal"
     printEqual(1, 1, 2);    print text "Neither all are equal or different"
     printEqual(-1, -1, -1)  print text "Invalid Value"
     printEqual(1, 2, 3)     print text "All numbers are different"

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
      The solution will not be accepted if there are extra spaces.
*/
