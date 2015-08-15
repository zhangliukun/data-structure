package sort;

public class RadixSort {
	
	public static void radixSort(int[] a){
		
		int maxLength = getMaxLength(a);
		
		//int maxLength = 4;
		
		int[] cache = new int[a.length];
		int[] calculateArray = new int[10];
		
		
		for(int i=0;i<maxLength;i++){
			
			resetCalculateArray(calculateArray);
			
			for(int j = 0;j<a.length;j++){
				calculateArray[getBitValue(a[j], i+1)] ++;
			}
			
			for(int j = 1;j<calculateArray.length;j++){
				calculateArray[j] = calculateArray[j]+calculateArray[j-1];
			}
			
			for(int j = a.length-1;j>=0;j--){
				
				int value = getBitValue(a[j], i+1);
				int position =calculateArray[getBitValue(a[j], i+1)]-1;
				
				cache[calculateArray[getBitValue(a[j], i+1)]-1] = a[j];
				calculateArray[getBitValue(a[j], i+1)]--;
			}
			
			
			System.arraycopy(cache, 0, a, 0, a.length);
		}
		
		
		
	}
	
	private static void resetCalculateArray(int[] calculateArray) {
		for(int i=0;i<calculateArray.length;i++){
			calculateArray[i]=0;
		}
	}

	/**
	 * 
	 * @param num 获得第几位
	 * @return
	 */
	public static int getBitValue(int num,int bit){
		
		for(int i=0;i<bit-1;i++){
			num = num/10;
		}
		return num%10;
		
	}
	
	/**
	 * get the max length
	 * @param a
	 * @return
	 */
	public static int getMaxLength(int[] a){
		
		int max = a[0];
		for(int i=1;i<a.length;i++){
			if (a[i] > max) {
				max = a[i];
			}
		}
		int length = 0;
		while(max!=0){
			max = max /10;
			length ++;
		}
		return length;
	}
	
	
	
}
