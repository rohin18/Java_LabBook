package lab1;

public class Exercise1 {

	public static int calculateSum(int n) {
		// Calculate sum of first n natural numbers which are divisible by 3 or 5.
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(calculateSum(10));
	}
}