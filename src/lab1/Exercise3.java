package lab1;

public class Exercise3 {
	
	public static boolean checkNumber(int number) {
		// Check if number is increasing number
		int last = number % 10;
		int prev = last;
		number = number / 10;
		while (number != 0) {
			if (last > prev) {
				return false;
			}
			prev = last;
			last = number % 10;
			number = number / 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkNumber(1234));
		System.out.println(checkNumber(134468));
		System.out.println(checkNumber(12343));
		System.out.println(checkNumber(5432));
		System.out.println(checkNumber(0));
	}
}