package javaStringProgramme;

public class ReverseAStringWithStringBuffer {

	public static void main(String[] args) {

		String str = "My name is Hero";
		String rev = "";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
