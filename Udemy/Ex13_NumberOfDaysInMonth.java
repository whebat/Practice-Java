/**
@author whebat
*/

public class Ex13_NumberOfDaysInMonth
{
	public static boolean isLeapYear(int year)
	{
		if (year < 1 || year > 9999 || year % 4 != 0)
			return false;

		return year % 100 == 0 ? year % 400 == 0 : true;
	}

	public static int getDaysInMonth(int month, int year)
	{
		if (year < 1 || year > 9999)
			return -1; // Invalid year.

		switch (month) {

		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;

		case 4: case 6: case 9: case 11:
			return 30;

		case 2:
			return isLeapYear(year) ? 29 : 28;

		default:
			return -1; // Invalid month.
		}
	}
}

/*
Write a method isLeapYear, see Ex04.

Write another method getDaysInMonth with two parameters (int) month and year.

If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month.
A leap year has 29 days in month 2 (February). Check if the
year is a leap year using the method isLeapYear described above.

EXAMPLE INPUT/OUTPUT:

     getDaysInMonth
     (1, 2020)  return 31, Jan has 31 days.
     (2, 2020)  return 29, Feb has 29 days in a leap year, 2020 is a leap year.
     (2, 2018)  return 28, Feb has 28 days as 2018 is not a leap year.
     (-1, 2020) return -1, parameter month is invalid.
     (1, -2020) return -1, parameter year is outside the range of 1 to 9999.

HINT: Use the switch statement.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
