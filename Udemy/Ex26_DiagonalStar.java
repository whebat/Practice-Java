/**
@author whebat
*/

public class Ex26_DiagonalStar
{
	public static void printSquareStar(int n)
	{
		if (n < 5)
			System.out.println("Invalid Value");
		else
			for (int i = -1; ++i < n; System.out.println())
				for (int j = 0; j < n; j++)
					System.out.print((
					j == 0     ||   // First row.
					j == n-1   ||   // Last row.
					i == 0     ||   // First column.
					i == n-1   ||   // Last column.
					i == n-1-j ||   // Diagonal '/'.
					i == j          // Diagonal '\'.
					) ? "*" : " ");
	}

/*
Write a method (printSquareStar) with 1 param (int) named number.
If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed
of stars (*). This should be accomplished by using loops (see examples below).


EXAMPLE INPUT/OUTPUT:

     printSquareStar(5):
     *****
     ** **
     * * *
     ** **
     *****

     Explanation:
     *****   5 stars
     ** **   2 stars space 2 stars
     * * *   1 star  space 1 star space 1 star
     ** **   2 stars space 2 stars
     *****   5 stars

     printSquareStar(8):
     ********
     **    **
     * *  * *
     *  **  *
     *  **  *
     * *  * *
     **    **
     ********

The patterns above consist of a number of rows and columns, where number is the number
of rows to print. For each row or column, stars are printed based on 4 conditions:

  In the first or last row
  In the first or last column
  When the row number equals the column number
  When the column number equals:
    rowCount - currentRow + 1 (where currentRow is current row number)

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
