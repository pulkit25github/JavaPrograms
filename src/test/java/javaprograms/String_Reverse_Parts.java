package javaprograms;

import java.util.Arrays;

public class String_Reverse_Parts {

	public static void main(String[] args) 
	{
		
		String str = "Hello World, Good Morning";   // output: world Hello, Morning Good
		String rev= "";
		
		String split [] = str.split(",");
		
		System.out.println(Arrays.toString(split));
		
		for (int i=0; i<split.length; i++)
		{
			 String space[] = split[i].split(" ");
           System.out.println(Arrays.toString(space).length());
			 
			 for (int j=space.length-1; j>=0; j--)
			 {
				 rev= rev + " " + space[j];
			 }
		
			 rev= rev +",";
		}
		
		System.out.println(rev);

	}

}
