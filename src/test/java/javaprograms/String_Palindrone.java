package javaprograms;

import java.util.Scanner;

public class String_Palindrone {

	public static void main(String[] args) 
	{
		
		      String str, rev = "";
		      Scanner sc = new Scanner(System.in);
		 
		      System.out.println("Enter a string:");
		      str = sc.nextLine();
		 
		      int length = str.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )  // length -1 = last character
		         rev = rev + str.charAt(i);
		 
		       System.out.println("Value of rev is : " + rev);
		       
		      if (str.equals(rev))
		      {
		         System.out.println(str+" is a palindrome");
		      }
		      else
		      {
		         System.out.println(str+" is not a palindrome");
		      }
		   }
		
}
