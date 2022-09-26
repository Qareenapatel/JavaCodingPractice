package javaArrayProgrammes;

public class PrintLargestNumber {

	public static void main(String[] args) {

		int[] arr = new int[] {1,5,32,78,95,65,82,12};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			}
			System.out.println("Print Largest number:" + max);
		}
	}


