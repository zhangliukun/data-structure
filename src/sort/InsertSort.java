package sort;

public class InsertSort {

	public static void insertSrot(int[] num) {

		for (int j = 1; j < num.length; j++) {
			for(int i = 0;i<j;i++){
				if (num[j]<num[i]) {
					int temp = num[j];
					for(int k = j;k>i;k--){
						num[k]= num[k-1];
					}
					num[i] = temp;
				}
			}
		}
		
//		for(int i=1;i<num.length;i++){
//			for(int j-i-1;j)
//		}
	}
	
	public static void insertSortV2(int[] num){
		int j;
		for(int i=1;i<num.length;i++){
			int temp  = num[i];
			for(j=i-1;j>=0&&num[j]<num[i];j--){
				num[j+1] = num[j];
			}
			num[j+1] = temp;
		}
	}

}
