/**
@author whebat
*/

public class Ex27_InputCalculator
{
	public static void inputThenPrintSumAndAverage()
	{
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double count = 0;

		for (; input.hasNextInt() && ++count > 0; input.nextLine())
			sum += input.nextDouble();

		System.out.print("SUM = " + (int) sum + " ");
		System.out.print("AVG = " + Math.round(sum / count));
		input.close();
	}

/*
Write a method (inputThenPrintSumAndAverage) that doesn't have any parameters.

The method (void) needs to keep reading int numbers from the keyboard.

When the user enters something that isn't an int,
it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.

EXAMPLE INPUT/OUTPUT:

EXAMPLE 1:

     INPUT:
     1
     2
     3
     4
     5
     a

     OUTPUT:
     SUM = 15 AVG = 3

EXAMPLE 2:

     INPUT:
     hello

     OUTPUT:
     SUM = 0 AVG = 0

TIP:  Use Scanner to read an input from the user.
      Use casting when calling the round method, it needs double as a parameter.

NOTE: Be mindful of spaces in the printed message.
      Be mindful of users who may type an invalid input right away.
      Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
