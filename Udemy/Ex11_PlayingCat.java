/**
@author whebat
*/

public class Ex11_PlayingCat
{
	public static boolean isCatPlaying(boolean summer, int temperature)
	{
		if (temperature < 25)
			return false;

		else if (summer == false)
			return (temperature > 35) ? false : true;

		else // (summer == true)
			return (temperature > 45) ? false : true;
	}
}

/*
The cats spend most of the day playing. In particular, they play if the
temperature is between 25 and 35 (inclusive). Unless it is summer, then
the upper limit is 45 (inclusive) instead of 35.

Write a method isCatPlaying that has 2 parameters.
Method needs to return true if the cat is playing, otherwise return false.

1st parameter (boolean) should be named summer.
2nd parameter (int) should be named temperature.


EXAMPLE INPUT/OUTPUT:

     isCatPlaying
     (true, 10)   false, temp. range isn't 25 - 45
     (false, 36)  false, temp. range isn't 25 - 35 (summer parameter is false)
     (false, 35)  true,  temp. range is 25 - 35 

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
