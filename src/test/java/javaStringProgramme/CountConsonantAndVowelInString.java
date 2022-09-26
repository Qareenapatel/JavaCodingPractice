package javaStringProgramme;

public class CountConsonantAndVowelInString {

	public static void main(String[] args) {

		int vCount = 0;
		int cCount = 0;
		
		String str = "This is really nice java coding Programme";
		
		//convert string into lowercase for comparison
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			
			//check whether a character is a vowel
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				
				//increments the vowel count
				vCount++;
							
			}
			//Check whether a character is a consonant
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				
				//increments the vowel count
				cCount++;
			}
			
		}
		System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
	}

}
