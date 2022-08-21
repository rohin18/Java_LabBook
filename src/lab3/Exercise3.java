package lab3;

import java.util.Arrays;

public class Exercise3 {

	public static int[] getSorted(int[] arr) {
		StringBuffer[] results = new StringBuffer[arr.length];
		int[] intResults = new int[arr.length];
		for (int i=0; i < arr.length; i++) {
			results[i] = new StringBuffer(Integer.toString(arr[i])).reverse();
			intResults[i] = Integer.parseInt(results[i].toString());
		}
		Arrays.sort(intResults);
		return intResults;
	}
	
	public static void main(String[] args) {
		int[] arr = {123, 234, 546, 786, 365};
		System.out.println(Arrays.toString(arr));
		System.out.println(
				Arrays.toString(getSorted(arr))
				);
	}
}