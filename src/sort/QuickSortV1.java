package sort;

import util.PrintUtil;

/**
 * 插空法快速排序
 * @author Zale
 *
 */
public class QuickSortV1 {

	public static void quickSort(int[] num, int start, int end) {
		
		if (start >= end) {
			return;
		}
		int priort = getMiddle(num,start,end);
		quickSort(num, start, priort -1);
		quickSort(num, priort + 1, end);
	}
	public static int getMiddle(int[] num, int start, int end) {
		int baseValue = num[start];
		int i = start;
		int j = end;
		while(i < j){
			//从 右边开始向左边查找
			while(num[j] >= baseValue && i<j){
				j--;
			}
			if (i<j) {
				num[i] = num[j];
				i++;
			}
			while(num[i] =< baseValue && i<j){
				i++;
			}
			if (i<j) {
				num[j] = num[i];
				j--;
			}
		}
		num[i] = baseValue;
		return i;
	}

}
