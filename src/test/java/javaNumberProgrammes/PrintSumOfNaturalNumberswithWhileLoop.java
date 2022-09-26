package javaNumberProgrammes;

public class PrintSumOfNaturalNumberswithWhileLoop {

	public static void main(String[] args) {

		int i = 1, num = 100, sum = 0;

		while (i <= num) {
			sum = sum + i;
			i++;
		}

		System.out.println("Sum of First 100 Natural Numbers is = " + sum);

	}

}
