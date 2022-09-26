package javaNumberProgrammes;

public class EvenNumberfrom1To100withForloop {

	public static void main(String[] args) {

		int num=100;
		System.out.println("List ofeven numbers from 1 to " + num);
		for(int i=1;i<=num;i++) {
			//if(i%2==0) //For even number
				if(i%2!=0) // for printing odd number
			{
				System.out.print(i+ " ");
			}
		}
		
	}

}
