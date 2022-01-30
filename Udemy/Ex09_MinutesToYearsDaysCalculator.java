/**
@author whebat
*/

public class Ex09_MinutesToYearsDaysCalculator
{
	public static void printYearsAndDays(long minutes)
	{
		if (minutes < 0)
			System.out.println("Invalid Value");

		else {

			long remainingMinutes = minutes % 60;
			long hours = (minutes - remainingMinutes) / 60;

			long remainingHours = hours % 24;
			long days = (hours - remainingHours) / 24;

			long remainingDays = days % 365;
			long years = (days - remainingDays) / 365;

			hours = remainingHours;
			days = remainingDays;

			System.out.println(minutes + " min = " +
			                   years   + " y and " +
			                   days    + " d");
		}
	}
}

/*
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the
years and days from the minutes parameter. If the parameter is less than 0,
print text "Invalid Value". Otherwise, if the parameter is valid then it
needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.


EXAMPLE INPUT/OUTPUT:

     printYearsAndDays(525600)   should print "525600 min = 1 y and 0 d"
     printYearsAndDays(1051200)  should print "1051200 min = 2 y and 0 d"
     printYearsAndDays(561600);  should print "561600 min = 1 y and 25 d"

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
      The solution will not be accepted if there are extra spaces.
*/
