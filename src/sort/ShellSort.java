package sort;

public class ShellSort {

//	public static void shellSort(int[] num) {
//
//		int b = num.length / 3;
//
//		while (b != 0) {
//
//			for (int i = 0; i < b; i++) {
//
//				for (int j = i + b; j < num.length; j = j + b) {
//
//					for (int k = i; k < j; k = k + b) {
//						if (num[j] < num[k]) {
//							int temp = num[j];
//							for (int m = j; m - b >= k; m = m - b) {
//								num[m] = num[m - b];
//							}
//							num[k] = temp;
//						}
//					}
//				}
//			}
//			b = b / 3;
//		}
//	}

	public static void shellSrot2(int[] a) {  
        int i, j, temp, increment;  
        // increment增量缩短，当增量为1时，即把整个数组进行插入排序  
        for (increment = a.length / 3; increment > 0; increment /= 3) {  
            for (i = increment; i < a.length; i++) {  
                temp = a[i];  
                for (j = i - increment; j >= 0 && temp < a[j]; j -= increment) {  
                    a[j + increment] = a[j];  
                }  
                a[j + increment] = temp;  
            }  
  
        }  
    } 
	
	
	public static void shellSort(int[] num){
		
		for(int gap = num.length/3;gap>0;gap=gap/3){
			
			for(int i=gap;i<num.length;i++){
				int temp = num[i];
				for(int j=i-gap;j>=0;j = j-gap){
					if (num[i] < num[j]) {
						num[i] = num[j];
					}
				}
			}
			
		}
		
	}
	
	
	
	
}
