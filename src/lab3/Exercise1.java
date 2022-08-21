package lab3;

public class Exercise1 {

	public static int getSecondSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		for (int num:arr) {
			if (num < smallest) {
				smallest = num;
			}
		}
		int secondSmallest = Integer.MAX_VALUE;
		for (int num:arr) {
			if (num < secondSmallest && num > smallest) {
				secondSmallest = num;
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args) {
		System.out.println(getSecondSmallest(new int[] {2,3,2,3,4}));
		System.out.println(getSecondSmallest(new int[] {1,5,4,6,4,1}));
		System.out.println(getSecondSmallest(new int[] {2,3,2,3,4,1}));

	}
}