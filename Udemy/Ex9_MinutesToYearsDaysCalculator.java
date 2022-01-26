/**
@author whebat
*/

public class Ex9_MinutesToYearsDaysCalculator
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
*/
