package saimacoder.code1166;

import java.util.Scanner;

/**
 *Input
第一行一个整数T，表示有T组数据。
每组数据第一行一个正整数N（N<=50000）,表示敌人有N个工兵营地，接下来有N个正整数,第i个正整数ai代表第i个工兵营地里开始时有ai个人（1<=ai<=50）。
接下来每行有一条命令，命令有4种形式：
(1) Add  i j,i和j为正整数,表示第i个营地增加j个人（j不超过30）
(2)Sub i j  ,i和j为正整数,表示第i个营地减少j个人（j不超过30）;
(3)Query i j ,i和j为正整数,i<=j，表示询问第i到第j个营地的总人数;
(4)End  表示结束，这条命令在每组数据最后出现;
  每组数据最多有40000条命令
Output
对第i组数据,首先输出“Case i:”和回车,
对于每个Query询问，输出一个整数并回车,表示询问的段中的总人数,这个数保持在int以内。
Sample Input
1
10
1 2 3 4 5 6 7 8 9 10
Query 1 3
Add 3 6
Query 2 7
Sub 10 2
Add 6 3
Query 3 10
End 
Sample Output
Case 1:
6
33
59
 * @author ShineMo-177
 *
 */
public class Main {
	
	

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int t=0,n=0;
		int[] a = new int[1];
		
		t = cin.nextInt();
		for(int i=0;i<t;i++){
			cin = new Scanner(System.in);
			n = cin.nextInt();
			cin = new Scanner(System.in);
			a = new int[n];
			for(int j=0;j<n;j++){
				a[j]= cin.nextInt();
			}
		}
		cin = new Scanner(System.in);
		while(true){
			String operation = cin.next();
			if (operation.equals("End")) {
				break;
			}else {
				
			}
		}
		
			
	}

}
