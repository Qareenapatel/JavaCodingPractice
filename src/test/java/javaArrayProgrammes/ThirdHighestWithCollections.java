package javaArrayProgrammes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdHighestWithCollections {

	public static int getThirdLargest(Integer[] a, int total) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(total-3);
		return element;
	}
		
	public static void main(String[] args) {
		
		Integer a[]= {1,2,5,9,6};
		Integer b[]= {44,66,99,88,55};
		System.out.println("Third Largest:" + getThirdLargest(a, 5));
		System.out.println("Third Largest:" + getThirdLargest(b, 5));
	}

}
