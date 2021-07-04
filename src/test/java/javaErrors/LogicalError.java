package javaErrors;

public class LogicalError {

	public static void main(String[] args)
	{
		
/*
 A logic error is when your program compiles and executes,
 but does the wrong thing or returns an incorrect result because of programmer wrong logic of code.
 These errors are detected neither by compiler nor by JVM.
 Logical errors are also called Semantic Errors.  */
		
		int a = 1000;
		
		int b = 40;
		
		int sumResult = a/b;     // get 25 but expectation is 1040
		
		System.out.println(sumResult);
		
// Expectation is 1040 but get result 25 because of wrong operator used by programmer		
		
		
		
	}

}
