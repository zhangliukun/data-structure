package sort;

public class ShellSort {

	public static void shellSort(int[] num){
		
		int j;
		
		for(int gap = num.length/2;gap>0;gap=gap/2){
			
			for(int i=gap;i<num.length;i++){
				int temp = num[i];
//				for(j=i-gap;j>=0;j = j-gap){
//					if (temp < num[j]) {
//						num[j+gap] = num[j];
//					}else{
//						break;
//					}
//				}
				for(j=i-gap;j>=0&&temp<num[j];j = j-gap){
					num[j+gap] = num[j];
				}
				num[j+gap] = temp;
			}
			
		}
		
	}
	
	
	
	
}
