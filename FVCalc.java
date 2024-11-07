// Computes the future value of a saving investment.

import java.util.Scanner;

public class FVCalc {
	public static void main(String[] args)
	{
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double trurate = (rate)/100;
		int years = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow(1.0 + trurate ,years);
		System.out.println("After " + years + " years, " +"$" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue);
	}
}