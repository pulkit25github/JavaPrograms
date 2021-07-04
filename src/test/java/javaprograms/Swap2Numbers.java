package javaprograms;

public class Swap2Numbers {

	public static void main(String[] args) 
	{
	
		int a = 10;
		int b = 20;
	
		System.out.println("Before swapping numbers are: " + a+ "  " +b);
		
		// Logic 1: Using third variable
		
	/*	
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After swapping numbers are: " + a+ "  " +b);   */
		
		// Logic 2: Without Using third variable
	
		
		a= a+b;  // 10 + 20 =30
		b= a-b; // 30- 20 = 10
		a=a-b;  // 30 - 10 = 20 
		
		System.out.println("After swapping numbers are: " + a+ "  " +b);	
		
		
	}

}
