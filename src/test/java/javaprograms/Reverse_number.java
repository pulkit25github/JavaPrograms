package javaprograms;

import java.util.Scanner;

public class Reverse_number {

	
	public static void main(String[] args) 
	{
	    int number;
        
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Enter the integer number");
	   
	   number= sc.nextInt();
	   
	   int rev=0;
	   
       while(number !=0 )
       {
    	   rev = rev*10 + number%10; //rev= 0*10 + 12345/10 and returns remainder 5 (last digit)
           number =number/10;       // number = 12345/10 = 1234 and keep iterating then ....123...then 12
       }
        
       System.out.println("Reverse Number is: " + rev); 
       
       System.out.println("*****USing String Buffer**********");
		// Using stringBuffer
		
		int num1 = 54321;
		String newNum = Integer.toString(num1);    //int to String
		
	//	int finalnew = Integer.parseInt(newNum);  // String to int
		
		StringBuffer sb = new StringBuffer(newNum);
		
		System.out.println(sb.reverse());
	    
	}

}
