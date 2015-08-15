package sort;

public class CountingSort {

	public static void countSort(int[] a,int[] b,int k){
		
		int[] c = new int[k+1];
		
		for(int i=0;i<c.length;i++){
			c[i] = 0;
		}
		
		for(int i =0;i<a.length;i++){
			c[a[i]]++;
		}
		
		for(int i=1;i<c.length;i++){
			c[i] = c[i]+c[i-1];
		}
		
		for(int i = a.length -1;i>=0;i--){
			b[c[a[i]]-1] = a[i];
			c[a[i]] --;
		}
		
	}
	
}
