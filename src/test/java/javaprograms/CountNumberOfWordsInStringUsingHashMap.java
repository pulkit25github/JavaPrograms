package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordsInStringUsingHashMap 
{

	
	public static void main(String[] args)
	{
		String str = "My name is Pulkit and name is Pulkit Rudra";
		String[] split = str.split(" ");
		
		
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		
		for (int i=0 ; i<split.length; i++)
		{
			
			if(words.containsKey(split[i]))
			{
				int count = words.get(split[i]);
				words.put(split[i], count+1);
			}
			
			else
			{
			words.put(split[i], 1);	
			}
		}
		
		System.out.println(words);
		
		
		}

	}


