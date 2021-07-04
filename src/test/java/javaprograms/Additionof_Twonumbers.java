package javaprograms;

import java.util.Scanner;

public class Additionof_Twonumbers {

	
	public static void main(String[] args) 
	{
		
		
		int a,b,sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		
		System.out.println("Enter Second number");
		b=sc.nextInt();
		
		sum= a+b;
		avg =(a+b)/2;

		System.out.print("Sum : " +sum +"\nAverage : " +avg);
	}

}
