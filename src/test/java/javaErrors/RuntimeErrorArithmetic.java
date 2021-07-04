package javaErrors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RuntimeErrorArithmetic {

	public static void main(String[] args) 
	{
		
		int a = 10;
		
		int b= 0;
		
		try
		{
		System.out.println(a/b);
		}
		
		catch (ArithmeticException e)
		{
			System.err.println("Exception is arithmetic: " + e.getMessage());
		}
		finally
		{
			System.out.println("Finally executed");
		}
	}
	}


