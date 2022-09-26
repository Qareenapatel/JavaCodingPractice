package javaNumberProgrammes;

public class SmallestNumber {

	public static void main(String[] args) {

		int a=4,b=78,c=19;
		
		//Comparing numbers a with b and a with c
		//if both the conditions true than print a
		if(a<=b && a<=c)
			System.out.println(a + " is the Smallest Number");
		else if(b<=a && b<=c)
			System.out.println(b + " is the Smallest Number");
		else
			System.out.println(c + " is the Smallest Number");
		
		
	}

}
