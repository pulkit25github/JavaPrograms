package javaprograms;


public class String_MaxOccuringCharacter {

	public static void main(String[] args) 
	{
	
		String str = "My name is pulkit";
		
		str= str.toLowerCase();
		
		System.out.println(str.replaceAll(" ", ""));

		
		char [] ch = str.toCharArray();
		
		System.out.println(ch);
		
		
		
	}

}
