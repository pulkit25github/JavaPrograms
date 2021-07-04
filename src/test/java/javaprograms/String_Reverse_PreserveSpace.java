package javaprograms;

import java.util.Arrays;

public class String_Reverse_PreserveSpace 
{

	static void spacePreserve(String input)
	{
		
		int len = input.length();
		// Initialize two pointers as two corners
		    int start = 0;
		    int end = len -1;
		
		char ch [] = input.toCharArray();
		    
		    
		 while (start < end)
		 {
			// If character at start or end is space, ignore it	   	 
			 if (ch[start] == ' ')
			 {
				 start++;
		         continue;
			 }
			 else if (ch[end] == ' ')
			 {
				 end--;
				 continue;
			 }
			 
			// If both are not spaces, do swap 
			 else 
			 {
				 char temp = ch[start];
				 ch[start] = ch[end];
				 ch[end]= temp;
				 start++;
				 end--;
			 }
			 
			 System.out.println(String.valueOf(ch));
			 
		 }
		
	}
	
	
	public static void main(String[] args)
	{
		
		
		String s1 = "ABC DE";          // output :  EDC BA
		
		spacePreserve(s1);
		
		
		
		
		

	}

}
