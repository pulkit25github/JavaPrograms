package roughPractice;

public class PrintOdd {

	
	static void pritOdd (int strt, int end)
	{
		
		System.out.print("Odd numbers are : ");
	
		for(int i=strt; i<end; i++)
		{
			
			if (i%2 != 0)
			{
				System.out.print(i + ",");
				
			}
			
		}
		
		
		
		
	}
	

	public static void main(String[] args)
	{
		PrintOdd po = new PrintOdd();
		po.pritOdd(5, 25);
		
		

	}

}
