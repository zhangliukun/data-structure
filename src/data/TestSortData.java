package data;

import java.util.Arrays;
import java.util.Random;

import sort.BinaryInsertSort;
import sort.InsertSort;
import sort.MergeSort;
import sort.PopSort;
import sort.QuickSortV1;
import sort.SelectSort;
import util.ShowResult;

public class TestSortData {

	public static void main(String[] args) {

		/**
		 * *****************************************��ʼ������***********************
		 * *******************************
		 */

		// ��������
		int[] num = new int[30];
		Random random = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100);
		}

		// int[] num = new int[]{74,79,26,3,33};

		System.out.print("ԭ����Ϊ:");
		
		ShowResult.showArrays(num);
		System.out.println();

		int[] copyNum = new int[num.length];

		/**
		 * *****************************************�㷨����************************
		 * *******************************
		 */

		// ��������

		System.arraycopy(num, 0, copyNum, 0, num.length);
		long startTime=System.currentTimeMillis();
		QuickSortV1.quickSort(copyNum, 0, copyNum.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.print("��������Ľ��Ϊ:");
		System.out.println((endTime - startTime)+"ms");
		//ShowResult.showArrays(copyNum);

		// ð������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		PopSort.popSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("ð������Ľ��Ϊ:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

		// ѡ������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		SelectSort.selectSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("ѡ������Ľ��Ϊ:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

		// ��������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		InsertSort.insertSrot(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("��������Ľ��Ϊ:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

		// ���ֲ�������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		BinaryInsertSort.binaryInsertSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("���ֲ�������Ľ��Ϊ:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

		// �鲢����
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		int[] temp = new int[30];
		MergeSort.mergeSortDivide(copyNum, 0, copyNum.length-1, temp);
		endTime = System.currentTimeMillis();
		System.out.print("�鲢����Ľ��Ϊ:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

	}

}
