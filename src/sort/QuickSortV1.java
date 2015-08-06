package sort;

import util.ShowResult;

/**
 * ��շ���������
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
			//�� �ұ߿�ʼ����߲���
			while(num[j] > baseValue && i<j){
				j--;
			}
			if (i<j) {
				num[i] = num[j];
				i++;
			}
			while(num[i] < baseValue && i<j){
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
