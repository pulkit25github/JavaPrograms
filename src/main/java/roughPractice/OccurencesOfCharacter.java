package roughPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OccurencesOfCharacter {

	public static void main(String[] args) 
	{
		
		// max number of occurences
		
		String str = "hweuidscbcbnjsiwohabjkxbcbjsoiwhifhsbcxbfdlioeitgfbc";
		
		Set<Character> hs = new HashSet<Character>();
		
		for (int i =0; i<str.length(); i++)
		{
			hs.add(str.charAt(i));
		} 
		
		// to sort set characters using tree set
		TreeSet<Character> ts = new TreeSet<Character>(hs);
		
		System.out.println("Characters are: " +ts);
		
		//  Create an array of set
		Character[] chSet = new Character[hs.size()];
		hs.toArray(chSet);
		
		 
		   for (int i=0; i<chSet.length; i++)
			{
		     	int count=0;
				
				 for (int j=0; j<str.length(); j++)  // inner loop will execute first completely
				 {
					 if(chSet[i] == str.charAt(j))
					 {
						 count = count +1;
					 }
					 
				 }	 
				 System.out.println("Number of Occuences for character " + chSet[i]+ " is " + count); 
			}
		   
		     
		   
	}
	}


