package javaBasicProgrammes;

import java.util.Scanner;

public class PrintASCIIValueWithScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		
		char ch = sc.next().charAt(0);
		int asciiValue = ch;
		System.out.println("ASCII value of " + ch + " is: " + asciiValue);
	}

}
