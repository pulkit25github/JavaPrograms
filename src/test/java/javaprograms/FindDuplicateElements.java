package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args)
	{
		String names [] = {"Java", "Ruby", "C++", "SQL", "Python", "Ruby", "SQL"};
	
		
		// 1. Using HashSet-- part of collections- It stores unique values only : O(n) time comlexity
		
		Set<String> store = new HashSet<String>();
		
		for(String name : names)
		{		 		
			if (store.add(name) == false)  
			{
				System.out.println("Duplicate element is : "+ name);
			}
		}
		
		// true: if value not present, so it will add....but if already present the false	
		
		
		System.out.println("**********************");	
		
		
		
	//2: Compare each element -- Time complexity of logic: O(nxn) time; 5sec x 5 sec = 25 secs time taken
		
		
		for (int i =0; i<names.length; i++)
		{
			for (int j=i+1; j<names.length; j++)
			{
				if (names[i].equals(names[j]))
				{
					System.out.println("Duplicate element is : " + names[i]);
				}
			}
		}
		
		
		
		
		
		
		
	}

}
