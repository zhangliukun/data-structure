package data;

import java.util.Arrays;
import java.util.Random;

import sort.InsertSort;
import sort.PopSort;
import sort.QuickSortV1;
import util.ShowResult;

public class TestSortData {

	public static void main(String[] args) {

		// ��������
		int[] num = new int[30];
		Random random = new Random();
		for(int i=0;i<num.length;i++){
			num[i] = random.nextInt(99)+1;
		}
		
//		int[] num = new int[]{74,79,26,3,33};
		
		System.out.print("ԭ����Ϊ:");
		ShowResult.showArrays(num);
		
		int[] copyNum = new int[num.length];

		// ��������

		System.arraycopy(num, 0, copyNum, 0, num.length);
		QuickSortV1.quickSort(copyNum, 0, copyNum.length - 1);
		System.out.print("��������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

		// ð������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		PopSort.popSort(copyNum);
		System.out.print("ð������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

		// ѡ������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		PopSort.popSort(copyNum);
		System.out.print("ѡ������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

		// ��������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		InsertSort.insertSrot(copyNum);
		System.out.print("��������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

		// ���ֲ�������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		InsertSort.insertSrot(copyNum);
		System.out.print("���ֲ�������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

	}

}
