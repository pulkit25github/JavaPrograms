package roughPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MaxPresentCharacter {

	public static void main(String[] args) 
	{
		
		String a = "khfkshkhhrehhtwhrgdghdkghdkhghgher";
		
		char [] array = a.toCharArray();
		
		Arrays.sort(array);
		
		System.out.println(array);
		
		//Convert ch [] array to string
		
		String str = new String(array);
	     
	    System.out.println(str);
		
		
		// using HashSet to count each occurence of character
		Set<Character> set = new HashSet<Character>();
		
		for (int i=0; i<array.length; i++)
		{
			set.add(str.charAt(i));
		}
		
		 System.out.println("After adding characters in set " +set);      // only unique values because of hashset.
		 
		// Sorting HashSet using TreeSet
        TreeSet<Character> treeSet = new TreeSet<Character>(set);
        
	   System.out.println("After sorting characters in set " +treeSet);    
		
	   
	   
	   // Create an ch array of set
	   Character [] chArr = new Character [set.size()];
	   set.toArray(chArr);
	   
	   Arrays.sort(chArr);
	   
	   for (int i=0; i<chArr.length; i++)
		{
	     	int count=0;
			
			 for (int j=0; j<str.length(); j++)
			 {
				 if(chArr[i] == str.charAt(j))
				 {
					 count = count +1;
				 }
				 
			 }
			 
			 System.out.println("Number of occurence of character " +chArr[i]+ " in string is " + count);
		 
		}
	         
	   
	   
	}

}
