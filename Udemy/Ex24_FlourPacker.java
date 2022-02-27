/**
@author whebat
*/

public class Ex24_FlourPacker
{
	public static boolean canPack(int bigC, int smallC, int goal)
	{
		// Initialize: Evaluation with it is done more than once.
		int bigCConvert = bigC * 5;

		if ((bigC < 0 || smallC < 0 || goal < 0) || // Negative values.
		    (bigCConvert + smallC < goal)        || // Combined < goal.
		    (bigCConvert > goal &&                  // bigCount fullbag
		     bigCConvert - 5 < goal - smallC))      // is < required.
			return false;

		else
			return true;
	}
}

/*
Write a method (canPack) with 3 param of type int: bigCount, smallCount, goal.

bigCount represents the count of big flour bags (5 kilos each).
smallCount represents the count of small flour bags (1 kilo each).
goal represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of bigCount and smallCount must be
at least equal to the value of goal. The method should return true
if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only
full bags are used towards the goal amount.

For example, if goal = 9, bigCount = 2, and smallCount = 0,
the method should return false.
(each big bag is 5 kilos and cannot be divided)

However, if goal = 9, bigCount = 1, and smallCount = 5,
the method should return true
(1 full bigCount bag and 4 full smallCount bags equal goal)
(It's okay if there are additional bags left over.)

If any of the parameters are negative, return false.


EXAMPLE INPUT/OUTPUT:

     canPack

     (1, 0, 4)   false: bigCount is 1 (big bag of 5 kilos), goal is 4 kilos.

     (1, 0, 5)   true:  bigCount is 1 (big bag of 5 kilos), goal is 5 kilos.

     (0, 5, 4)   true:  smallCount is 5 (small bags of 1 kilo), goal is 4 kilos,
                        and we have 1 bag left which is ok as mentioned above.

     (2, 2, 11)  true:  bigCount is 2 (big bags 5 kilos each),
                        and smallCount is 2 (small bags of 1 kilo),
                        makes in total 12 kilos and goal is 11 kilos.

     (-3, 2, 12) false: bigCount is negative.

NOTE: Method needs to be defined as public static.
      Do not add a main method to solution code.
*/
