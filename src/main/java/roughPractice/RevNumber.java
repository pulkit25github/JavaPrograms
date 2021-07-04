package roughPractice;

import javax.xml.bind.ParseConversionEvent;

public class RevNumber {

	public static void main(String[] args) 
	{
		
		int num = 12345;
		int rev = 0;
		
		// Using while loop
		
		while(num != 0)
		{
			rev = rev *10 + num%10;   // Return remainder
			num = num/10;
		}
		
		System.out.println("Reverse number is "+ rev);
		
		
		System.out.println("*****USing String Buffer**********");
		// Using stringBuffer
		
		int num1 = 54321;
		String newNum = Integer.toString(num1);    //int to String
		
	//	int finalnew = Integer.parseInt(newNum);  // String to int
		
		StringBuffer sb = new StringBuffer(newNum);
		
		System.out.println(sb.reverse());
		

	}

}
