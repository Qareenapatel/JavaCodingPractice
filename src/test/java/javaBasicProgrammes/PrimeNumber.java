package javaBasicProgrammes;

public class PrimeNumber {

	public static void main(String[] args) {

		int no = 7, temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp++;
			}
		}
		if (temp == 0) {
			System.out.println(no + ":is prime no");
		} else {
			System.out.println(no + ":is not prime no");
		}
	}

//or

//	
	/*
	 * int num=7,count=0; for(int i=1;i<=num;i++) { if(num%i==0) { count++; } }
	 * if(count==2) { System.out.println(num+ ":is prime no"); }else {
	 * System.out.println(num+ ":is not prime no"); }
	 * 
	 * }
	 */

}
