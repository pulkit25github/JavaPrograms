package roughPractice;

public class PrintEven 
{
	
	// logic 1: using method for range
	public void evenNum (int start, int end)
	{
		for (int i=start; i<=end; i++)
		{
			if (i%2 == 0)
			{
				System.out.println("Even numbers are: " +i);
			}
		}
	}

	// logic 2: directly
	public static void main(String[] args) 
	{
		
		for (int i=1; i<=10; i++)
		{
			if (i%2 == 0)
			{
				System.out.println("Even numbers are: " +i);
			}
		}
		
		System.out.println("******Calling Method********");
		
		PrintEven num = new PrintEven();
		num.evenNum(5, 27);

	}

}
