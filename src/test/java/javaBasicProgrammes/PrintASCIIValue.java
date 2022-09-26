package javaBasicProgrammes;

public class PrintASCIIValue {

	public static void main(String[] args) {

		// Character whose ASCII value to be found
		char ch1 = 'A';
		char ch2 = 'a';

		// Casting or converting a character into int type

		int ascii1 = (int) ch1;
		int ascii2 = (int) ch2;

		System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);
		System.out.println("The ASCII value of " + ch2 + " is: " + ascii2);

	}

}
