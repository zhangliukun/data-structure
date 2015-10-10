package saimacoder.code2002;

import java.util.Scanner;

public class Main {
	
	static double Pi = 3.1415927;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		double r;
		while (cin.hasNext()) {
			r = cin.nextDouble();
			System.out.println(String.format("%.3f", r*r*r*Pi*4/3));
		}
	}

}
