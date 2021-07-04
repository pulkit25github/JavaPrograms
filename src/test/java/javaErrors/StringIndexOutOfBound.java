package javaErrors;

public class StringIndexOutOfBound {

	public static void main(String[] args)
	{
		
		String a = "This is like chipping"; // length is 21
       
		char c = a.charAt(24); // accessing 25th element
        System.out.println(c);
		
		

	}

}
