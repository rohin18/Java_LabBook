package lab1;

public class Exercise4 {

	public static boolean checkNumber(int n) {
		// Check if input number is power of two or not
		if (n < 2) {
			return false;
		}
		while (n > 2) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkNumber(8));
		System.out.println(checkNumber(64));
		System.out.println(checkNumber(13));
		System.out.println(checkNumber(1));
		System.out.println(checkNumber(3));
		System.out.println(checkNumber(12));

	}
}