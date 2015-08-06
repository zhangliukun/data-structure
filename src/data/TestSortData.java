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
			num[i] = random.nextInt(99) + 1;
		}

		// int[] num = new int[]{74,79,26,3,33};

		System.out.print("ԭ����Ϊ:");
		ShowResult.showArrays(num);

		int[] copyNum = new int[num.length];

		/**
		 * *****************************************�㷨����************************
		 * *******************************
		 */

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
		SelectSort.selectSort(copyNum);
		System.out.print("ѡ������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

		// ��������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		InsertSort.insertSrot(copyNum);
		System.out.print("��������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

		// ���ֲ�������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		BinaryInsertSort.binaryInsertSort(copyNum);
		System.out.print("���ֲ�������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

		// �鲢����
		System.arraycopy(num, 0, copyNum, 0, num.length);
		int[] temp = new int[30];
		MergeSort.mergeSortDivide(num, 0, num.length-1, temp);
		System.out.print("�鲢����Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);

	}

}
