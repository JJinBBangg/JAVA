package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		int[] newIntArray1 = Arrays.copyOf(oldIntArray, oldIntArray.length);
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		System.out.println(Arrays.toString(newIntArray));
		System.out.println(Arrays.toString(newIntArray1));
	}
}