package javaprograms;

import java.util.Arrays;

public class String_Reverse_Part2 {

	public static void main(String[] args)
	{
		
String str = "PULKIT AND RUDRA";
		
		String rev= "";
		
		String newStr = str.replaceAll("AND", "");
	
		System.out.println(newStr);
		
		String split[] = newStr.split("  ");
		System.out.println(Arrays.toString(split));
		
		for (int i=0; i<split.length; i++)
		{
			String name = split[i];
			
			for (int j=name.length()-1 ; j>=0; j--)
			{
				rev = rev + name.charAt(j);
				
			}
			
			rev = rev + " AND ";
		}
		
		String finalWord = rev.substring(0,16);
		
		System.out.println(finalWord);
		



	}

}
