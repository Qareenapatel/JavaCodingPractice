package javaArrayProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatefromArray {

	public static void main(String[] args) {

         //int []arr = {10,20,30,10,20,30,40};
		
		Set<Integer> myset = new LinkedHashSet<Integer>(Arrays.asList(10,20,30,10,20,30,40));

		ArrayList<Integer> dupRemove = new ArrayList<Integer>(myset);
		System.out.println(dupRemove);

	}

}
