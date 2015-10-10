package saimacoder.code2001;

import java.util.Scanner;
/**
 * Problem Description
�����������꣨X1,Y1��,��X2,Y2��,���㲢��������ľ��롣
Input
���������ж��飬ÿ��ռһ�У���4��ʵ����ɣ��ֱ��ʾx1,y1,x2,y2,����֮���ÿո������
Output
����ÿ���������ݣ����һ�У����������λС����
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
