/**
@author whebat
*/

public class Ex8_AreaCalculator
{
	public static double area(double radius)
	{
		if(radius < 0)
			return -1;

		return (radius * radius) * Math.PI;
	}

	public static double area(double x, double y)
	{
		if(x < 0 || y < 0)
			return -1;

		return (x < 0 || y < 0) ? -1 : x * y;
	}
}

/*
*/
