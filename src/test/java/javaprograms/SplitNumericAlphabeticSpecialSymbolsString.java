package javaprograms;




public class SplitNumericAlphabeticSpecialSymbolsString 
{

	public static void main(String[] args) 
	{
		String str= "My name is pulkit 10021025 of %#@$%";
		
		//Call the method
		splitString(str);
	    	
	}
	
	
	static void splitString (String str)
	{
	StringBuffer num = new StringBuffer();
	StringBuffer alpha = new StringBuffer();
	StringBuffer special = new StringBuffer();
	
	for (int i=0; i<str.length(); i++)
	{
		
		if(Character.isDigit(str.charAt(i)))
			num.append(str.charAt(i));
		
		else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
		
		else
			 special.append(str.charAt(i));
				
	}
	
	System.out.println("Numbers are: " + num);
	System.out.println("Alphabets are : " + alpha);
	System.out.println("Special characters are:" +special);

	}

	

}
