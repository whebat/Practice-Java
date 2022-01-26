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
*/
