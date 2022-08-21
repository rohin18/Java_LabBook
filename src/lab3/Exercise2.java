package lab3;

import java.util.Arrays;

public class Exercise2 {

	public static String[] sortAlphabeticaly(String[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		String[] arr = {"World", "Hello", "me", "hi", "apple", "Ball"};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortAlphabeticaly(arr)));
	}
}