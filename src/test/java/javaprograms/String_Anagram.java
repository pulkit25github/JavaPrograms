package javaprograms;

import java.util.Arrays;


public class String_Anagram 
{

	
	public static void main(String[] args) 
	{
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter your First word");  
		String str1 = sc.nextLine();
		
		System.out.println("Enter your Second word");  
		String str2 = sc.nextLine();
		
		
	//	String str1 = "Race";
	//	String str2= "Care";
		
		str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
		
	    // check if length is same
	    if(str1.length() != str2.length()) 
	    {
	    	 System.out.println(str1 + " and " + str2 + " are not anagram.");
	    	 
	    }
	      // convert strings to char array
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();
	   
	      System.out.println(charArray1);  
	      System.out.println(charArray2);  
	   
	   // sort the char array
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);
			
			
	   // if sorted char arrays are same
	      // then the string is anagram
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result == true) 
	      {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	      
	}
}
	