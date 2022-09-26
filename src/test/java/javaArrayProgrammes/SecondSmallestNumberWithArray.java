package javaArrayProgrammes;

import java.util.Arrays;

public class SecondSmallestNumberWithArray {

	public static int getSecondSmallest(int[] a, int total) {

		Arrays.sort(a);
		return a[1];

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 5, 9, 6 };
		int[] b = { 44, 66, 88, 99, 12, 23 };
		System.out.println("Second Smallest:" + getSecondSmallest(a, 6));
		System.out.println("Second Smallest:" + getSecondSmallest(b, 6));
	}

}
