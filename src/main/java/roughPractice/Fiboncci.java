package roughPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Fiboncci {

	public static void main(String[] args)
	
	{
		int SeriesNum ;
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter the length of fibonacci series : ");
        
        SeriesNum=sc.nextInt();
         
            int num[]= new int[SeriesNum];
             num[0] = 0;
             num[1] = 1;
		
	for (int i=2 ; i<SeriesNum; i++)
	{
		// 2-1 + 2-2 = 1
	  num[i] = num[i-1] + num[i-2];	
	}
	
	System.out.print("Fibonacci series are: ");
	for (int i =0; i<SeriesNum; i++)
	{
		System.out.print(num[i] + " ");
	
	}
		
		
		

	}

}
