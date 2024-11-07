// Splits a restaurant bill evenly among three diners.

import java.util.Scanner;

public class Bill3 {
	public static void main(String[] args)
	{
		String User1 = args[0];
		String User2 = args[1];
		String User3 = args[2];
		double Sum = Double.parseDouble(args[3]);
		double EachSum = Sum/3;
		EachSum = Math.ceil(EachSum);
		System.out.println("Dear " + User3 + ", " + User2 + ", " + "and " + User1 + ": pay " + EachSum + " Shekels each");
	}
}
