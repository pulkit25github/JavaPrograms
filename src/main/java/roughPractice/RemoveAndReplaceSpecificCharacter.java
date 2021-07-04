package roughPractice;

import java.util.Arrays;

public class RemoveAndReplaceSpecificCharacter {

	public static void main(String[] args)
	{
		String str = "abbccdde";
		
		// Removing
		int index= 6;
		String newstr;
	   
		newstr= str.substring(0,index) + str.substring(index+1);

		System.out.println(newstr);
		
		
		//Relacing e with f
		
		String str1= "abcde";
		int indexx= 4;
		char ch = 'f';
		
		String str2 = str1.substring(0, indexx) + ch;
		
		System.out.println(str2);   
		
		
	}

}
