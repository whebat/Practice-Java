/**
@author whebat
*/

public class Ex28_PaintJob
{
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
	{
		if (extraBuckets   < 0 ||
		    width         <= 0 ||
		    height        <= 0 ||
		    areaPerBucket <= 0)
			return -1;

		return (getBucketCount(width, height, areaPerBucket) - extraBuckets);
	}

	public static int getBucketCount(double width, double height, double areaPerBucket)
	{
		if (width <= 0 || height <=0)
			return -1;

		return getBucketCount(width * height, areaPerBucket);
	}

	public static int getBucketCount(double area, double areaPerBucket)
	{
		if (area <= 0 || areaPerBucket <= 0)
			return -1;

		return (int) Math.ceil(area / areaPerBucket);
	}
}

/*
Bob is a wall painter and he needs your help. You have to write a program that
helps Bob calculate how many buckets of paint he needs to buy before going to
work. Bob might also have some extra buckets at home. He also knows the area
that he can cover with one bucket of paint.

1. Write a method (getBucketCount) with 4 param:

   1st - "width" (double),  the width of the wall.
   2nd - "height" (double), the height of the wall.
   3rd - "areaPerBucket",   area that can be covered with 1 bucket of paint.
   4th - "extraBuckets",    the bucket count that Bob has at home.

Method needs to return a value (int) that represents the
number of buckets that Bob needs to buy before going to work.
To calculate the bucket count, refer to the notes below.

If one of the parameters (width, height or areaPerBucket) is
less or equal to 0 or if extraBuckets is less than 0,
the method needs to return -1 to indicate an invalid value.

If all parameters are valid,
the method needs to calculate the number of buckets and return it.

EXAMPLE INPUT/OUTPUT:

    getBucketCount
    (-3.4, 2.1,  1.5, 2) return -1, the width parameter is invalid.

    (3.4,  2.1,  1.5, 2) return 3, the wall area is 7.14, a single bucket
                         covers an area of 1.5, Bob has 2 extra buckets home.

    (2.75, 3.25, 2.5, 1) return 3, the wall area is 8.9375, a single bucket
                         covers an area of 2.5, Bob has 1 extra bucket at home.

2. Bob doesn't like to enter 0 for extraBuckets param, he needs another method.

Write an overloaded method with 3 parameters,
width, height, areaPerBucket (all of type double).

3. In some cases, Bob doesn't know the width and height of the wall
   but he knows the area of a wall. He needs you to write another method.

Write another overloaded method with 2 parameters,
area and areaPerBucket (both of type double).

EXAMPLE INPUT/OUTPUT:

    getBucketCount
    (3.4, 1.5) return 3, area is 3.4, 1 bucket covers an area of 1.5
    (6.26, 2.2) return 3, area is 6.26, 1 bucket covers an area of 2.2.
    (3.26, 0.75) return 5, area is 3.26, 1 bucket covers an area of 0.75.

NOTE: Use Math.ceil to round the number of calculated buckets (double),
      then convert it into an int before returning the value from the methods.
      Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
