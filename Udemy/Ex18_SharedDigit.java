/**
@author whebat
*/

public class Ex18_SharedDigit
{
	public static boolean hasSharedDigit(int y, int z)
	{
		if (y < 10 || y > 99 || z < 10 || z > 99)
			return false;

		// Finding both digits of y.
		int y1st = y % 10;
		int y2nd = (y / 10) % 10;

		// Finding both digits of z.
		int z1st = z % 10;
		int z2nd = (z / 10) % 10;

		if (y1st == z1st || y1st == z2nd || y2nd == z1st || y2nd == z2nd)
			return true;
		else
			return false;
	}
}

/*
*/
