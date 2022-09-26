package javaNumberProgrammes;

import java.util.Scanner;

public class NumberIsPositiveOrNegative {

	public static void main(String[] args) {

		int num;

		// Object of the scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");

		// reading a number from the user
		num = sc.nextInt();

		// check the number is greater then 0 or not
		if (num > 0) {
			System.out.println("The number is positive");
		}
		// Check the number is less than 0 or not
		else if (num < 0) {
			System.out.println("The number is negative");
		}
		// Execute when the above two conditions return false
		else {

			System.out.println("The number is zero");
		}
	}

}
