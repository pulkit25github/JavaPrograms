package roughPractice;

public class String_Percentage {

	public static void main(String[] args) 
	{
		String str = "ARdskdEgdgddhdh#$%%ASFFRhTAR98797979%&^$^$$";
		
		int len = str.length();   
		System.out.println("Length of string is: "+len);          
		
		float upperpercentage;
		float lowerpercentage;
		float digitpercentage;
		float specialpercentage;
		
		StringBuffer upperCase = new StringBuffer();
		StringBuffer lowerCase = new StringBuffer();
		StringBuffer digits = new StringBuffer();
		StringBuffer special = new StringBuffer();       
		
		
		for (int i =0 ; i<str.length(); i++)
		{
			
			if (Character.isUpperCase(str.charAt(i)))
			{
				upperCase = upperCase.append(str.charAt(i));
				
			}
			else if (Character.isLowerCase(str.charAt(i)))
			{
				lowerCase = lowerCase.append(str.charAt(i));
				
			}
			else if (Character.isDigit(str.charAt(i)))
			{
				digits= digits.append(str.charAt(i));
				
			}
			else 
			{
				special= special.append(str.charAt(i));
				
			}
		}
		
		float upperlen = upperCase.length();
//		System.out.println(upperlen);
		
		upperpercentage = (upperlen/len) * 100;
		System.out.println("UpperCase percentage is : " + upperpercentage);
		
		float lowerlen = lowerCase.length();
	//	System.out.println(lowerlen);
		
		lowerpercentage = (lowerlen/len) * 100;
		System.out.println("lowerCase percentage is : " + lowerpercentage);
		
		float digitlen = digits.length();
//		System.out.println(digitlen);
		
		digitpercentage = (digitlen/len) * 100;
		System.out.println("Digits percentage is : " + digitpercentage);
		
		float speciallen = special.length();
 //   	System.out.println(speciallen);
		
		specialpercentage = (speciallen/len) * 100;
		System.out.println("Special percentage is : " + specialpercentage);
		

	}

}
