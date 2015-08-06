package data;

import java.util.Arrays;

import sort.PopSort;
import sort.QuickSortV1;
import util.ShowResult;

public class TestSortData {
	
	public static void main(String[] args){
		
		//��������
		int[] num = new int[]{32,12,5,13,13,123,13,124};
		int[] copyNum = new int[num.length];
		
		//��������
		
		System.arraycopy(num, 0, copyNum, 0, num.length);
		QuickSortV1.quickSort(copyNum, 0,copyNum.length-1);
		System.out.print("��������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);
		
		//ð������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		PopSort.popSort(copyNum);
		System.out.print("ð������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);
		
		//ѡ������
		System.arraycopy(num, 0, copyNum, 0, num.length);
		PopSort.popSort(copyNum);
		System.out.print("ѡ������Ľ��Ϊ:");
		ShowResult.showArrays(copyNum);
		
		
	}
	
	
	
}
