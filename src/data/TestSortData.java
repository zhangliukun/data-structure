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
		 * *****************************************初始化区域***********************
		 * *******************************
		 */

		// 测试数据
		int[] num = new int[30];
		Random random = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(99) + 1;
		}

		// int[] num = new int[]{74,79,26,3,33};

		System.out.print("原数组为:");
		ShowResult.showArrays(num);

		int[] copyNum = new int[num.length];

		/**
		 * *****************************************算法区域************************
		 * *******************************
		 */

		// 快速排序

		System.arraycopy(num, 0, copyNum, 0, num.length);
		QuickSortV1.quickSort(copyNum, 0, copyNum.length - 1);
		System.out.print("快速排序的结果为:");
		ShowResult.showArrays(copyNum);

		// 冒泡排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		PopSort.popSort(copyNum);
		System.out.print("冒泡排序的结果为:");
		ShowResult.showArrays(copyNum);

		// 选择排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		SelectSort.selectSort(copyNum);
		System.out.print("选择排序的结果为:");
		ShowResult.showArrays(copyNum);

		// 插入排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		InsertSort.insertSrot(copyNum);
		System.out.print("插入排序的结果为:");
		ShowResult.showArrays(copyNum);

		// 二分插入排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		BinaryInsertSort.binaryInsertSort(copyNum);
		System.out.print("二分插入排序的结果为:");
		ShowResult.showArrays(copyNum);

		// 归并排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		int[] temp = new int[30];
		MergeSort.mergeSortDivide(num, 0, num.length-1, temp);
		System.out.print("归并排序的结果为:");
		ShowResult.showArrays(copyNum);

	}

}
