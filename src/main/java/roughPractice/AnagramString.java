package roughPractice;

import java.util.Arrays;


public class AnagramString {

	public static void main(String[] args)
	{
		String a= "Read is";
		String b= "Dear is";
		
		a= a.toLowerCase();
		b= b.toLowerCase();
		
		// convert into array......so that we can sort it
		char [] array = a.toCharArray();
		char [] array1 = b.toCharArray();
				
		Arrays.sort(array);
		Arrays.sort(array1);
		
		System.out.println(array);
		System.out.println(array1);
		 
		boolean value = Arrays.equals(array, array1);
		
		
		if (value == true)
		{
			System.out.println("Stings are anagram");
		}
		else
		{
			System.out.println("Stings are not anagram");
		}
		
		

	}

}
