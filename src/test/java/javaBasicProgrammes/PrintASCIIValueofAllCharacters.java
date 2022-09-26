package javaBasicProgrammes;

public class PrintASCIIValueofAllCharacters {

	public static void main(String[] args) {

		//for(int i=0;i<=255;i++) 
		for(int i = 65; i<=122;i++)
		{
			System.out.println("The ASCII Value of " + (char)i + " = " + i);
		}
	}

}
