package sort;

public class BinaryInsertSort {

	public static void binaryInsertSort(int[] num) {

		for (int j = 1; j < num.length; j++) {
			int temp = num[j];

			int insertPosition = binarySearchInsertPosition(num, temp, 0, j - 1);
			for (int k = j; k > insertPosition; k--) {
				num[k] = num[k - 1];
			}
			num[insertPosition] = temp;
		}
	}

	public static int binarySearchInsertPosition(int[] num, int target,
			int startIndex, int endIndex) {

		if (startIndex >= endIndex) {
			if (num[startIndex] < target)
				return startIndex + 1;
			else{
				return startIndex;
			}
		}

		int middle = (startIndex + endIndex) / 2;
		if (target > num[middle]) {
			return binarySearchInsertPosition(num, target, middle + 1, endIndex);
		} else if (target < num[middle]) {
			return binarySearchInsertPosition(num, target, startIndex,
					middle - 1);
		} else {
			return middle + 1;
		}

	}
	
}
