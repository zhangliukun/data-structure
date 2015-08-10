package sort;

public class ShellSort {
	
	public static void shellSort(int[] num){
		
		int b = num.length/2;
		
		while(b!=0){
			
			for(int i= 0;i<num.length;i++){
				
				for(int j= i;j+b<num.length;j = j+b){
					
					
					for(int k=j+b;k<num.length;k=k+b){
						int temp;
						if (num[k] < num[j]) {
							temp = num[j];
							for(int m =j;m+b<k;m = m+b){
								
							}
							
						}
					}
					
//					int temp;
//					if (num[j+b]<num[j]) {
//						temp = num[j];
//						num[j] = num[j+b];
//						num[j+b] = temp;
//					}
				}
				
			}
			b = b/2;
			
		}
		
	}
}
