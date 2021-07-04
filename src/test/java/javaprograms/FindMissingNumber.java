package javaprograms;

public class FindMissingNumber {

	public static void main(String[] args)
	{
		
		int num []= {1,2,3,4,5,7};
		int sum= 0;
		
		// sum: 1+2+3+4+5+7 = 22
		// sumAll = sum of first to last number: 1+2+3+4+5+6+7 = 28 
        // sumAll - sum : 28 - 22 = 6 is missing number		

		for (int i=0; i<num.length; i++)         //length is 6
		{
			sum =sum + num[i];        // sum = 0 + 1 =1.... sum = 1+ 2 =3........sum= 3 + 4 =7.......
		}
		System.out.println(sum);
		
		
		
		int sum1 =0;
		for (int j=1; j<= 7; j++)        //loop starts from 1st and till last number  <= 7....till last number
		{
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println("Missing number is : " + (sum1- sum));
	}

}
