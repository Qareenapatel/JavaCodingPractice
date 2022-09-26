package javaArrayProgrammes;

public class PrintSmallestNumber {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 6, 8, 65, 12 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Print smallest number:" + min);

	}
}
