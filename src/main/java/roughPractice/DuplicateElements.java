package roughPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args)
	{
		
		String lang [] = {"Java", "C", "Python", "SQL", "C", "Python"};
		
		//Logic1: comparing with each other
		int len = lang.length;
		
		for (int i=0; i<len ; i++)
		{
			for (int j= i+1; j<len; j++)
			{
				
				if (lang[i].equals(lang[j]))
				{
					System.out.println("Duplicate element is:" +lang[i]);
				}
				
			}
		}
		
		System.out.println("*****Using HashSet*******");
	//Logic 2: Using HashSet
		
		Set<String> langSet = new HashSet<String>();
		
		//for each loop
		
		for (String val : lang)
		{
			if(langSet.add(val)== false)
			{
				System.out.println("Duplicate element is:" + val);
			}
		}
		
		
		
		
		
		
		
		
	}

}
