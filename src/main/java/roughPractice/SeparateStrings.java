package roughPractice;

public class SeparateStrings {

	public static void main(String[] args) 
	{
		
		String str = "My name is %&^&$$& Pulkit and age is 30 *&(& and year 1990";
		
		StringBuffer num = new StringBuffer();
		StringBuffer alpha = new StringBuffer();
		StringBuffer special = new StringBuffer();
		
		for (int i=0; i<str.length(); i++)
		{
		
		if(Character.isDigit(str.charAt(i)))
		{
			num.append(str.charAt(i));	
		}
		else if (Character.isAlphabetic(str.charAt(i)))
		{
			
			alpha.append(str.charAt(i));
		}
		else
		{
		special.append(str.charAt(i));	
		}
	}
		System.out.println("Digits are:" + num);
		System.out.println("Alphabets are:" + alpha);
		System.out.println("Special are:" + special);
		
		
		
	}

}
