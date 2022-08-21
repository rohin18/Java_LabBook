package lab1;

public class Exercise2 {
	
	public static int calculateDifference(int n) {
		// Find the difference between the sum of the squares of the first n 
		// natural numbers and the square of their sum.
		int sumOfSquare = 0;
		int squareOfSum = 0;
		for (int i=1; i<=n; i++) {
			sumOfSquare += (i * i);
			squareOfSum += i;
		}
		return (sumOfSquare - squareOfSum * squareOfSum);
	}
	
	public static void main(String[] args) {
		System.out.println(calculateDifference(3));

	}

}