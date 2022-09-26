package javaStringProgramme;

public class CountTotalCharactersInString {

	public static void main(String[] args) {

		String str = "I am the best person";
		
		int count = 0;
		
		//Count each character except space
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!= ' ') {
				count++;
		}
        //Displays the total number of characters present in the given string    

	}
        System.out.println("Total number of characters in a string: " + count);    

}
}
