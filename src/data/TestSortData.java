package data;

import java.util.Arrays;

import sort.PopSort;
import sort.QuickSortV1;
import util.ShowResult;

public class TestSortData {
	
	public static void main(String[] args){
		
		//测试数据
		int[] num = new int[]{32,12,5,13,13,123,13,124};
		int[] copyNum = new int[num.length];
		
		//快速排序
		
		System.arraycopy(num, 0, copyNum, 0, num.length);
		QuickSortV1.quickSort(copyNum, 0,copyNum.length-1);
		System.out.print("快速排序的结果为:");
		ShowResult.showArrays(copyNum);
		
		//冒泡排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		PopSort.popSort(copyNum);
		System.out.print("冒泡排序的结果为:");
		ShowResult.showArrays(copyNum);
		
		//选择排序
		System.arraycopy(num, 0, copyNum, 0, num.length);
		PopSort.popSort(copyNum);
		System.out.print("选择排序的结果为:");
		ShowResult.showArrays(copyNum);
		
		
	}
	
	
	
}
