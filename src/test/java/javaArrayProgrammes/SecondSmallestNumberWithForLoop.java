package javaArrayProgrammes;

public class SecondSmallestNumberWithForLoop {

	public static int getSecondSmallest(int[] a, int total) {

		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[5];
		//return a[0];
	}

	public static void main(String[] args) {

		int c[] = { 1, 3, 5, 6, 8, 9 };
		int b[] = { 44, 65, 23, 85, 78, 90, 82 };
		System.out.println("Second Smallest: " + getSecondSmallest(c, 6));
		System.out.println("Second Smallest: " + getSecondSmallest(b, 7));

	}

}
