package sort;

public class BinaryInsertSort {

	public static void binaryInsertSort(int[] num){
	
		
		for (int j = 1; j < num.length; j++) {
			for(int i = 0;i<j;i++){
				
				int temp = num[j];
				int insertPosition = binarySearchInsertPosition(num, num[i], 0, j-1);
				for(int k =j;k>insertPosition;k--){
					num[k] = num[k-1];
				}
				num[i] = temp;
			}
		}
	}
	
	public static int  binarySearchInsertPosition(int[] num,int target,int startIndex,int endIndex){
		
		if (startIndex == endIndex) {
			return startIndex;
		}
		
		int middle = (startIndex + endIndex)/2;
		if (target>num[middle]) {
			return binarySearchInsertPosition(num, target, middle+1,endIndex);
		}else if(target <num[middle]){
			return binarySearchInsertPosition(num, target, startIndex, middle-1);
		}else {
			return middle+1;
		}
		
	}
	
	
}
