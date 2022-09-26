package javaNumberProgrammes;

public class ReverseNumberWithWhileLoop {

	public static void main(String[] args) {

		
		int num=98765;
		int reverse=0;
		
		while(num!=0) {
			int reminder=num%10;//5
			reverse=reverse*10 + reminder;
			num=num/10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
