package javaprograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class String_RemoveDuplicates {

	public static void main(String[] args)
	{
		String str= "My name is name is Pulkit pulkit my";
		
		str= str.toLowerCase();
		
		// one liner code: logic 1
		
		 str = Arrays.stream(str.split(" ")).distinct().collect(Collectors.joining(" "));
		 System.out.println(str);
		
		 
		 // 2nd logic:
		/*
         * Since the words are separated by space,
         * we will split the string by one or more space
         * 
          \\s    - matches single whitespace character
          \\s+    - matches sequence of one or more whitespace characters.
         * 
         */
        
        String[] strWords = str.split(" ");
        
        
		
        //convert String array to LinkedHashSet to remove duplicates
        
        LinkedHashSet<String> lhSetWords = new LinkedHashSet<>(Arrays.asList(strWords));
        
      //join the words again by space
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;
        
       for(String s : lhSetWords)
       {
           
    	   if(index > 0)
            sbTemp.append(" ");
        
            sbTemp.append(s);
            index++;
        }
       
       str = sbTemp.toString();
       
       System.out.println("String after removing duplicate words: " +str);
      
	}

}
