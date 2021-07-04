package roughPractice;

public class SmallestAndLargest {

	public static void main(String[] args) 
	{
	

		int [] numbers = {5,45,-87,12,56,22};
		
		 int smallest = numbers[0];
		 int largest = numbers[0];
		 
		 for (int i=1; i<numbers.length; i++)
		 {
				 if (numbers[i]<smallest)
				 {
					 smallest = numbers[i];
					 
				 }
				 else if (numbers[i]>largest)
				 {
					 largest = numbers[i];
					 
				 }
				 
			 }
			 
		 System.out.println("Smallest Number is: "+ smallest);
		 System.out.println("Largest Number is :" + largest);
		 
		 }
	}


