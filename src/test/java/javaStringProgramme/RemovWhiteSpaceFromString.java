package javaStringProgramme;

public class RemovWhiteSpaceFromString {

	public static void main(String[] args) {

		String str = "I am the best for everywhere";
		
		str = str.replaceAll("\\s+", "");
		
		System.out.println("String after removing all the white spaces : " + str);
	}

}
