package javaStringProgramme;

public class ReverseStringWithCharArray {

	public static void main(String[] args) {

		String str = "My name is Hero";
		String rev = "";
		
		char c[] = str.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) {
			rev = rev + c[i];
		}
		System.out.println(rev);
		
		
	}

}
