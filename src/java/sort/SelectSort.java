package sort;

/**
 * —°‘Ò≈≈–Ú
 * @author Zale
 *
 */
public class SelectSort {

	public static void selectSort(int[] num){
		
		for(int i=0;i<num.length-1;i++){
			
			int minIndex = i;
			for(int j=i+1;j<num.length;j++){
				if (num[minIndex]>num[j]) {
					minIndex = j;
				}
			}
			if (!(minIndex ==i) ) {
				int temp = num[i];
				num[i] = num[minIndex];
				num[minIndex] = temp;
			}
		}
	}
}
