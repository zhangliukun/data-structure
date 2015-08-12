package data;

import java.util.Random;

import sort.BinaryInsertSort;
import sort.HeapSort;
import sort.InsertSort;
import sort.MergeSort;
import sort.PopSort;
import sort.QuickSortV1;
import sort.SelectSort;
import sort.ShellSort;
import util.ShowResult;

public class TestSortData {

	public static void main(String[] args) {

		/**
		 * *****************************************��ʼ������***********************
		 * *******************************
		 */

		// ��������
		int[] num = new int[1000];
		Random random = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100000);
		}

		// int[] num = new int[]{74,79,26,3,33};

		System.out.print("ԭ����Ϊ:");

		//ShowResult.showArrays(num);
		System.out.println();

		int[] copyNum = new int[num.length];

		/**
		 * *****************************************�㷨����************************
		 * *******************************
		 */

		// ��������

		System.arraycopy(num, 0, copyNum, 0, num.length);
		long startTime = System.currentTimeMillis();
		QuickSortV1.quickSort(copyNum, 0, copyNum.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.print("��������Ľ��Ϊ:");
		System.out.println((endTime - startTime) + "ms");
		// ShowResult.showArrays(copyNum);

		// ð������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime = System.currentTimeMillis();
		//PopSort.popSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("ð������Ľ��Ϊ:");
		// ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime) + "ms");

		// ѡ������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime = System.currentTimeMillis();
		//SelectSort.selectSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("ѡ������Ľ��Ϊ:");
		// ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime) + "ms");

		// ��������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime = System.currentTimeMillis();
		//InsertSort.insertSrot(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("��������Ľ��Ϊ:");
		// ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime) + "ms");

		// ���ֲ�������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime = System.currentTimeMillis();
		//BinaryInsertSort.binaryInsertSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("���ֲ�������Ľ��Ϊ:");
		// ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime) + "ms");

		// �鲢����
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime = System.currentTimeMillis();
		int[] temp = new int[500000];
		startTime = System.currentTimeMillis();
		MergeSort.mergeSortDivide(copyNum, 0, copyNum.length - 1, temp);
		endTime = System.currentTimeMillis();
		System.out.print("�鲢����Ľ��Ϊ:");
		// ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime) + "ms");

		// ������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		System.out.print("������Ľ��Ϊ:");
		startTime = System.currentTimeMillis();
		HeapSort.buildHeap(copyNum, (copyNum.length - 1) / 2, copyNum.length);
		// ShowResult.showArrays(copyNum);
		HeapSort.deleteMinHead(copyNum, (num.length - 2) / 2, num.length);
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms");

		// ϣ������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime = System.currentTimeMillis();
		ShellSort.shellSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("ϣ������Ľ��Ϊ:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime) + "ms");

		// ϣ������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime = System.currentTimeMillis();
		ShellSort.shellSrot2(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("ϣ������2�Ľ��Ϊ:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime) + "ms");

	}

}
