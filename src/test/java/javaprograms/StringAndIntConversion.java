package javaprograms;

import java.util.Arrays;

public class StringAndIntConversion {

	public static void main(String[] args) 
	{
		//1. String to String Array  (use split method)
		
		String str = "My name is pulkit";
		
		String [] split = str.split(" ");
		
		System.out.println(Arrays.toString(split));
		
	  //2. String array to String  (use Arrays.toString)
		
		String [] abc = {"India", "is", "my", "country"};
		
		String abc1 = Arrays.toString(abc);

		System.out.println(abc1);
		
		//logic 2: for string array [] to string using string builder without []
		
		StringBuilder sb = new StringBuilder();
		
		for (int i =0; i<abc.length; i++)
		{
			sb.append(abc[i] + " ");	
		}
		
		String newAbc = sb.toString();
		System.out.println(newAbc);
		
	//3. String to int using Integer.parseInt(String)
		
		String s1 = "123545645";
	
	    int hello= Integer.parseInt(s1);
	    
	    System.out.println(hello);
	    
	    //logic 2: String to int using Integer.valueOf(String)
	    
	    String s2= "3446567";
	    int num = Integer.valueOf(s2);
	    
	    System.out.println(num);
	    
	    String s3 = "000001234";
	    
	   s3 = s3.format("%09d", Integer.parseInt(s3)+ 16);        // %09d.....starting with 0 and upto 9 digits......and adding 16 in result
	    
	    System.out.println(s3);
	    
	    
	    
	
	}
	}
