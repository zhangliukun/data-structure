package sort;

public class MergeSort {
	
	public static void mergeSortDivide(int[] num,int start,int end,int[] temp){
		
		if (start <end ) {
			
			int middle = (start + end)/2;
			mergeSortDivide(num, start, middle, temp);
			mergeSortDivide(num, middle+1, end, temp);
			mergeList(num, start, middle, end, temp);
		}
	}
	
	public static void mergeList(int[] num,int start,int middle,int end,int[] temp){
		
		int i=start,j =middle+1;
		int m = middle,n = end;
		int k=0;
		
		while(i<=m && j<= n){
			if (num[i]>num[j]) {
				temp[k++] = num[j++];
			}else{
				temp[k++] = num[i++];
			}
		}
		
		while(i<=m){
			temp[k++] = num[i++];
		}
		while(j<=n){
			temp[k++] = num[j++];
		}
		
		for(int s=0;s<k;s++){
			num[start+s] = temp[s];
		}
		
		
	}
	

}
