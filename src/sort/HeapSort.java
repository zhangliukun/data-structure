package sort;

public class HeapSort {
	
	//f is the father node, n is the count of nodes
	public static void adjustHeap(int[] num,int f,int n){
		int sLeft = f*2+1;
		if (sLeft>=n) {
			return;
		}
		int temp = num[f];
		if(sLeft +1 <n && num[sLeft] > num[sLeft+1]){
			sLeft ++;
		}
		if (num[f] >num[sLeft]) {
			
			num[f] = num[sLeft];
			num[sLeft] = temp;
		}
		adjustHeap(num, sLeft, n);
	}
	
	public static void buildHeap(int[] num,int f, int n){
		
		for(int i=f;i>=0;i--){
			adjustHeap(num, i, n);
		}
	}
	
	public static void deleteMinHead(int[] num,int f,int n){
		
		while(n>0){
			
			//System.out.print(num[0]+" ");
			num[0] = num[n-1];
			n--;
			adjustHeap(num, 0,n);
		}
		
	}

	
}
