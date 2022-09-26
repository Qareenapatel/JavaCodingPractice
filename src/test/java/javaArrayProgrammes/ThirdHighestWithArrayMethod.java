package javaArrayProgrammes;

import java.util.Arrays;

public class ThirdHighestWithArrayMethod {

	public static int getThirdHighest(int a[], int total) {

		Arrays.sort(a);
		return a[total - 3];
	}

	public static void main(String[] args) {

		int a[] = { 1, 3, 9, 5, 7 };
		int b[] = { 65, 85, 6, 8, 10 };
		System.out.println("Third Largest:" + getThirdHighest(a, 5));
		System.out.println("Third Largest:" + getThirdHighest(b, 5));

	}

}
