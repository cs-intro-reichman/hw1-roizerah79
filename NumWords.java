// Prints a given number using a hundreds, tens, and units notation.

import java.util.Scanner;

public class NumWords {
	public static void main(String args[])
	{
		int completenum = Integer.parseInt(args[0]);
		int hundrednum = completenum/100;
		int tennum = (completenum - (hundrednum*100))/10;
		int onenum = (completenum - (hundrednum*100) - (tennum*10));
		System.out.println(hundrednum + " hundreds, " + tennum + " tens, and " + onenum + " ones.");
	}
}
