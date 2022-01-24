public class Ex3_BarkingDog
{
	public static boolean shouldWakeUp (boolean barking, int hourOfDay)
	{
		boolean after_10PM_before_8AM = false;

		if (hourOfDay >= 0 && hourOfDay < 8)
			after_10PM_before_8AM = true;

		else if (hourOfDay > 22 && hourOfDay <= 23)
			after_10PM_before_8AM = true;

		return ( (barking) && (after_10PM_before_8AM) ) ? true : false;
	}
}

/*
We have a dog that likes to bark.
We need to wake up if the dog is barking at night!

Write a method shouldWakeUp that has 2 parameters.

1st parameter: type boolean, represents if our dog is currently barking.
2nd parameter: type int, represents the hour of the day, valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours
so in that case return true. In all other cases return false.
If the hourOfDay parameter is less than 0 or greater than 23 return false.

EXAMPLE INPUT/OUTPUT:

shouldWakeUp
     (true, 1);  → true
     (false, 2); → false since the dog is not barking.
     (true, 8);  → false since it's not before 8.
     (true, -1); → false since the hourOfDay parameter's range must be 0-23.

TIP: Use the if else statement with multiple conditions.

NOTE: The shouldWakeUp method needs to be defined as public static.
      Do not add a  main method to solution code.
*/
