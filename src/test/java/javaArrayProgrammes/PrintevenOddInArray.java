package javaArrayProgrammes;

public class PrintevenOddInArray {

	public static void main(String[] args) {

		int [] arr = {1,2,3,5,6,8,9};
		System.out.println("Print Even numbers:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+ " ");
			}
		}
		System.out.println();
		System.out.println("Print Odd Numbers: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+ " ");
			}
		}
		
		
	}

}
