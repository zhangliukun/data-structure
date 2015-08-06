package sort;

public class PopSort {
	
	public static void popSort(int[] num){
		
		for(int i=num.length-1; i>=0;i--){
			for(int j=0;j<i;j++){
				if (num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
	}

}
