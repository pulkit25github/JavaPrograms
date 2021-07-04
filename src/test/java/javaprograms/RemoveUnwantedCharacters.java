package javaprograms;

public class RemoveUnwantedCharacters {

	public static void main(String[] args)
	{
		
		String s1= "^*&$&$^*^* *-*-* My Name Is &^@$$ Pulkit And Age Is 30 (&(&(&&&";
		
		//Use regular expression [^a-zA-Z0-9]  ......include all these.....remove rest
		s1= s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
		
		//regular expression to add space before every Capital character..... 
		s1= s1.replaceAll("(?!^)([A-Z0-9])", " $1");
		
		System.out.println(s1);
		
		
		
		

	}

}
