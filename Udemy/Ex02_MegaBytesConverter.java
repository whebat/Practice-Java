/**
@author whebat
*/

public class Ex02_MegaBytesConverter
{
	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	{
		if (kiloBytes < 0)
			System.out.println("Invalid Value");
		else {

		int remainingkiloBytes = kiloBytes % 1024;
		int megabytes = (kiloBytes - remainingkiloBytes) / 1024;

		System.out.println(kiloBytes + " KB = " +
		                   megabytes + " MB and " +
		                   remainingkiloBytes + " KB");
		}
	}
}

/*
Write a method called printMegaBytesAndKiloBytes that has
1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate
the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.

For example, when the parameter kiloBytes is 2500
it needs to print "2500 KB = 2 MB and 452 KB"

If the parameter kiloBytes is less than 0
then print the text "Invalid Value".

EXAMPLE INPUT/OUTPUT:

     printMegaBytesAndKiloBytes(2500); → "2500 KB = 2 MB and 452 KB"
     printMegaBytesAndKiloBytes(-1024); → "Invalid Value"
     printMegaBytesAndKiloBytes(5000); → "5000 KB = 4 MB and 904 KB"

TIP: Be extremely careful about spaces in the printed message.
     Use the remainder operator
     1 MB = 1024 KB

NOTE: Do not set kilobytes parameter value inside your method.
      The solution will not be accepted if there are extra spaces.
      The method needs to be defined as public static.
      Do not add a main method to solution code.
*/
