package javaArrayProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestNumberWithCollections {

	public static int getSecondSmallest(Integer a[], int total) {
		
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(1);
		return element;
	}
		
	public static void main(String[] args) {

		Integer [] a = { 1, 2, 3, 5, 9, 6 };
		Integer [] b = { 44, 66, 88, 99, 12, 23 };
		System.out.println("Second Smallest:" + getSecondSmallest(a, 6));
		System.out.println("Second Smallest:" + getSecondSmallest(b, 6));
	}

}
