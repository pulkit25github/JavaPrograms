package roughPractice;

public class UnwantedCharacters {

	public static void main(String[] args)
	{
		
		String str = "%&%*^*^ My Name Is Pulkit **(&(& And Age Is 30*^*^^^*";
		
		//use regular expression
		
		 String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		 
		 System.out.println(newStr);
		 
		 //use again regular expression to add space if you want
		 
		 String spaceStr= newStr.replaceAll("(?!^)([A-Z0-9])", " $1");    // add space before Capital letter and numeric
		 
		 System.out.println(spaceStr);
		 
		

	}

}
