package saimacoder.code1166;

import java.util.Scanner;

/**
 *Input
��һ��һ������T����ʾ��T�����ݡ�
ÿ�����ݵ�һ��һ��������N��N<=50000��,��ʾ������N������Ӫ�أ���������N��������,��i��������ai�����i������Ӫ���￪ʼʱ��ai���ˣ�1<=ai<=50����
������ÿ����һ�����������4����ʽ��
(1) Add  i j,i��jΪ������,��ʾ��i��Ӫ������j���ˣ�j������30��
(2)Sub i j  ,i��jΪ������,��ʾ��i��Ӫ�ؼ���j���ˣ�j������30��;
(3)Query i j ,i��jΪ������,i<=j����ʾѯ�ʵ�i����j��Ӫ�ص�������;
(4)End  ��ʾ����������������ÿ������������;
  ÿ�����������40000������
Output
�Ե�i������,���������Case i:���ͻس�,
����ÿ��Queryѯ�ʣ����һ���������س�,��ʾѯ�ʵĶ��е�������,�����������int���ڡ�
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
