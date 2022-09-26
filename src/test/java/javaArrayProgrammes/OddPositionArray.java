package javaArrayProgrammes;

public class OddPositionArray {

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Print array in even position:");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}

}
