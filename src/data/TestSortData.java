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
			num[i] = random.nextInt(100);
		}

		// int[] num = new int[]{74,79,26,3,33};

		System.out.print("原数组为:");
		
		ShowResult.showArrays(num);
		System.out.println();

		int[] copyNum = new int[num.length];

		/**
		 * *****************************************算法区域************************
		 * *******************************
		 */

		// 快速排序

		System.arraycopy(num, 0, copyNum, 0, num.length);
		long startTime=System.currentTimeMillis();
		QuickSortV1.quickSort(copyNum, 0, copyNum.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.print("快速排序的结果为:");
		System.out.println((endTime - startTime)+"ms");
		//ShowResult.showArrays(copyNum);

		// 冒泡排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		PopSort.popSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("冒泡排序的结果为:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

		// 选择排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		SelectSort.selectSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("选择排序的结果为:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

		// 插入排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		InsertSort.insertSrot(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("插入排序的结果为:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

		// 二分插入排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		BinaryInsertSort.binaryInsertSort(copyNum);
		endTime = System.currentTimeMillis();
		System.out.print("二分插入排序的结果为:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

		// 归并排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		startTime=System.currentTimeMillis();
		int[] temp = new int[30];
		MergeSort.mergeSortDivide(copyNum, 0, copyNum.length-1, temp);
		endTime = System.currentTimeMillis();
		System.out.print("归并排序的结果为:");
		//ShowResult.showArrays(copyNum);
		System.out.println((endTime - startTime)+"ms");

	}

}
