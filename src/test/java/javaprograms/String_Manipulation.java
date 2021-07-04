package javaprograms;

import junit.framework.Assert;

public class String_Manipulation {

	public static void main(String[] args)
	{
		
		String str= "Welcome To My Country India Friends";
		String str1= "Welcome To My Country India Friends";
		
		System.out.println(str.length());    // length of string
		
		System.out.println(str.charAt(15));   // value on 5th index
		
		int first_e_Character = str.indexOf("e");    // index of e is 3
		System.out.println(first_e_Character);
		
		int Next_e_Chracter = str.indexOf("e", first_e_Character + 1);     // index of next e
		System.out.println(Next_e_Chracter);
		
		System.out.println(str.indexOf("hello"));   // -1 if value is not present
		System.out.println(str.indexOf("z"));   // -1 if value is not present
		
		//String comparsion
		
		boolean value = str.equals(str1);
		System.out.println(value);
		
		System.out.println("*********substring**********");
		//Substring
		System.out.println(str.substring(8));
		System.out.println(str.subSequence(0, 10));
		
		System.out.println("*********split**********");
		//split  
		String s1 = "Hello_My_World_Selenium";
		String[] word = s1.split("_");
		
		for (int i=0; i<word.length; i++)
		{
			System.out.println(word[i]);
		}
		
		System.out.println("*********trim**********");
		//trim 
		String st = "     Hello     World  ";
		System.out.println(st.trim());
		
		System.out.println("*********replace**********");
		//replace  
		System.out.println(st.replace(" ", ""));
		
		//Date
		String date= "25-10-1990";   // replace with /
		System.out.println(date.replace("-", "/"));
		
		System.out.println("*********concat**********");
		//concat
		String x = "Hello";
		String y = "World";
		int a= 100;
		int b= 200;
		
		System.out.println(x+y);  // Hello + world = HelloWorld
		System.out.println(a+b);  // 100+200 = 300
		System.out.println(x+y+a+b);   // HelloWorld100200     .......adding from left to right
		System.out.println(x+a+b+y);   // Hello100200World
		System.out.println(a+b+x+y);   //300HelloWorld
		System.out.println(x+y +(a+b));   //HelloWorld300
		
		System.out.println("*********Diff b/w == and equals**********");
		//Diff b/w == and equals
		
		String st1 = new String("india");
		System.out.println(st1);
		String st2 = new String("india");
		System.out.println(st2);
		
		System.out.println(st1 == st2);     // false..... == is for reference comparison
		
		System.out.println(st1.equals(st2)); // true ....equals is for content comparison
		
	}

}
