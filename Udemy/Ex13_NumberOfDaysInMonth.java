/**
@author whebat
*/

public class Ex13_NumberOfDaysInMonth
{
	public static boolean isLeapYear(int year)
	{
		if (year < 1 || year > 9999 || year % 4 != 0)
			return false;

		else if (year % 100 == 0)
			return (year % 400 == 0) ? true : false;

		else
			return true;
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
			return (isLeapYear(year)) ? 29 : 28; // true : false;

		default:
			return -1; // Invalid month.
		}
	}
}

/*
*/
