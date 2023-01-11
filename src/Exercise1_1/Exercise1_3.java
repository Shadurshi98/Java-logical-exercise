package Exercise1_1;

public class Exercise1_3 {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i< A.length; i++) {
			sum = sum + A[i];
		}
		System.out.print(sum);
	}

}
