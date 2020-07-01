package util;

import java.util.Random;

public class DataUtil {
	
	public static int[] CreateTestData(int numLength){
		int[] num = new int[numLength];
		Random random = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100);
		}
		
		return num;
	}

}
