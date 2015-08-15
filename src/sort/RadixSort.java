package sort;

public class RadixSort {
	
	public void radixSort(int[] a){
		
		int max = getMaxLength(a);
		
		int[] cache = new int[a.length];
		int[] calculater = new int[10];
		
		
		
		
	}
	
	/**
	 * 
	 * @param num 获得第几位
	 * @return
	 */
	public int getBitValue(int num,int bit){
		
		for(int i=0;i<bit-1;i++){
			num = num/10;
		}
		return num%10;
		
	}
	
	/**
	 * 获取最大数的数
	 * @param a
	 * @return
	 */
	public int getMaxLength(int[] a){
		
		int max = a[0];
		for(int i=1;i<a.length;i++){
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	
	
}
