// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Scanner;

public class Ascend {
	public static void main(String[] args) 
	{
		int ascendlim = Integer.parseInt(args[0]);
		int ran1 = (int)(Math.random() * ascendlim);
		int ran2 = (int)(Math.random() * ascendlim);
		int ran3 = (int)(Math.random() * ascendlim);
		System.out.println(ran1 + " " + ran2 + " " + ran3);
		int tempmin = Math.min(ran1,Math.min(ran2,ran3));
		int tempmax = Math.max(ran1,Math.max(ran2,ran3));
		int tempmid = (ran1 + ran2 + ran3) - tempmax - tempmin;
		ran1 = tempmin;
		ran2 = tempmid;
		ran3 = tempmax;
		System.out.println(ran1 + " " + ran2 + " " + ran3);
	}
}
