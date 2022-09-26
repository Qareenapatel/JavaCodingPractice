package javaBasicProgrammes;

import java.util.Scanner;

public class PalindromeNumberWithScannerClass {

	public static void main(String[] args) {

		String original,reverse = ""; //Objects of string class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String/Number to check if it is palindrome or not:");
		original=sc.nextLine();
		
		int length = original.length();
		
		for(int i=length-1;i>=0;i--)
			reverse = reverse + original.charAt(i);
		
		if(original.equals(reverse))
			System.out.println("Entered String/Number is a palindrome");
		else
			System.out.println("Entered String/Number is not a palindrome");
	}

}
