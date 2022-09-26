package javaStringProgramme;

public class ReplaceSpaceWithSpecialCharacters {

	public static void main(String[] args) {

		String str = "Once upon a time in Mumbai";
		char ch = '&';
		String Str1 = str.replace(' ', ch); 
		
		System.out.println("String After replacing with given character: " + Str1);
	}

}
