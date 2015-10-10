package saimacoder.code2003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		double x;
		while (cin.hasNext()) {
			x = cin.nextDouble();
			if (x<0) {
				x= -x;
			}
			System.out.println(String.format("%.2f", x));
		}
	}

}
