package javaprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import junit.framework.Assert;


public class String_reverse_part3 
{

	public static void main(String[] args)
	{
	
		String str = "Hello World, Good Morning";   // output: Hello dlroW, Good gninroM
		String val1="";
		String val2= "";
		
		String valSt1="";
		String valSt2="";
		
		String revst1Store = "";
		String revst2Store = "";
		
		String split[] = str.split(",");
		
		for (int i =0; i<split.length; i++)
		{
			 val1 = split[0];
			
			 val2 = split[1];	
			 val2 = val2.trim();
			
		}
		System.out.println("Val1 is:" + val1);
		System.out.println("Val2 is:" + val2);
		
		String split1[] = val1.split(" ");
		
		System.out.println(Arrays.toString(split1));
		
		for (int j=0; j<split1.length; j++)
		{
			
			valSt1= split1[1];
		}
			 
			for (int k = valSt1.length()-1; k>=0; k--)
			{
				revst1Store= revst1Store + valSt1.charAt(k);
			}
		
        String split2[] = val2.split(" ");
        System.out.println(Arrays.toString(split2));
		
		for (int l=0;l<split2.length; l++)
		{
			
			valSt2= split2[1];
		}	
			for (int m = valSt2.length()-1; m>=0; m--)
			{
				revst2Store= revst2Store + valSt2.charAt(m);
			}
			

		valSt1= split1[0] + " " + revst1Store + ", "; 
		valSt2= split2[0] + " " + revst2Store;	
		
		System.out.println(valSt1 + valSt2);
		
}

	
}