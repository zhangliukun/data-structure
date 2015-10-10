package saimacoder.code2001;

import java.util.Scanner;
/**
 * Problem Description
输入两点坐标（X1,Y1）,（X2,Y2）,计算并输出两点间的距离。
Input
输入数据有多组，每组占一行，由4个实数组成，分别表示x1,y1,x2,y2,数据之间用空格隔开。
Output
对于每组输入数据，输出一行，结果保留两位小数。
Sample Input
0 0 0 1
0 1 1 0
Sample Output
1.00
1.41
 * @author ShineMo-177
 *
 */
public class Main {
	
	public static void  main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		double x1,y1,x2,y2;
		
		while(cin.hasNext()){
			x1 = cin.nextDouble();
			y1 = cin.nextDouble();
			x2 = cin.nextDouble();
			y2 = cin.nextDouble();
			
			System.out.println(String.format("%.2f", Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))));
		}
		
	}
	
}
