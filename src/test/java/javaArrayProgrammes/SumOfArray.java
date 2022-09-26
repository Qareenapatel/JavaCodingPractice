package javaArrayProgrammes;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,64,95};

		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Print sum of array:" + sum);
	}

}
