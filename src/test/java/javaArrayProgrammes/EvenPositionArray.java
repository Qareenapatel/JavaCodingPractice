package javaArrayProgrammes;

public class EvenPositionArray {

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Print array in odd position:");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}

}
