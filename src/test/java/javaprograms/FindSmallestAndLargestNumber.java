package javaprograms;

class FindSmallestAndLargestNumber {

	public static void main(String[] args) 
	{
		// O(n)
		int numbers [] = {25,4,84,98,65,-54,987,-547};	
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
	for (int i=1; i<numbers.length; i++)
	{
		if (numbers[i]> largest)   // if 4 is largest then 25  --- No.... then move to else if
		{
			largest= numbers[i];
		}
		else if (numbers[i]< smallest)
		{
			smallest = numbers[i];  // if 4 is smallest then 25....Yes...so new value of smallest is 4 and keep going....
		}
	
	}
		
	System.out.println("Largest number is :" + largest);
	System.out.println("Smallest number is :" + smallest);
		
		
		
		

	}

}
