package roughPractice;

public class MissingNumber {

	public static void main(String[] args) 
	{
		
		/*
		 Logic: First add given number {1 2 3 4 6} and sum it 16
		 then add sum of all till last number including missing = 21
		 */
	
// In sum: take index int i =0....always and length
		int num[] = {-1,0,1,2,4,5};
		int len = num.length;
		
		int sum= 0;
		
		for (int i=0; i<len; i++)
		{
			sum = sum + num[i];
		}
		
		System.out.println("Sum is:" + sum);

	// In next sum: take int j = first element till j<=last element	
		
		int sum1=0;
		
		for (int j=-1; j<=5; j++)
		{
			sum1 = sum1 +j;
		}
		System.out.println("Sum1 is:" + sum1);
		
		System.out.println("Missing number is:" + (sum1-sum));
		
		
	}

}
