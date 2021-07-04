package roughPractice;

public class Stringpalindrome {

	public static void main(String[] args) 
	{
		String str = "nitin";
		
		String one = "";
		String two= "";
	
		for (int i=0; i<str.length(); i++)
		{
			one= one + str.charAt(i);
		}	
		
		for (int j=str.length()-1; j>=0; j--)
		{
			two= two + str.charAt(j);
		}
		
		if (one.equals(two))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
			

	}

}
