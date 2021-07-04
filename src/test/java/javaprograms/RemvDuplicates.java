package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemvDuplicates {

	public static void main(String[] args) 
	{
		
		String str= "My name is name is Pulkit my";
	
	// Logic1: Using linkedHashSet
		
		//convert to lowercase
		str= str.toLowerCase();
		
		//split the string
		String [] strsplit=  str.split(" ");
		
		System.out.println(Arrays.toString(strsplit));
		
		//convert String array to LinkedHashSet to remove duplicates as it follows iteration order
		LinkedHashSet<String> lh = new LinkedHashSet<String>(Arrays.asList(strsplit));
		System.out.println(lh);
      
		
// Logic 2: Java 8 function
		String str1 = "I love my love india my";
		
		 str1 = Arrays.stream(str1.split(" ")).distinct().collect(Collectors.joining(" "));
		          
		 System.out.println(str1);
		
        
		
	}

}
