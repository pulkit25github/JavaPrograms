package roughPractice;

public class SwapNumbers {

	public static void main(String[] args)
	{
		
		int a = 20;
		int b= 40;
	  
		// logic 1: using a+b and a-b
	    a=a+b;   // a= 20+40= 60
	    b=a-b;   //b= 60-40 =20; 
	    a= a-b;   // a= 60-20= 40;
	    
	    System.out.println("Now A value is: "+ a);
	    System.out.println("Now B value is: "+ b);
		
	    
	    System.out.println("*******USING 3rd variable***********");
	    //Using temp or 3rd variable;
		
	    int x = 50;
		int y= 60;
	    
		int temp =x;
		x=y;
		y=temp;
	    
		 System.out.println("Now X value is: "+ x);
		 System.out.println("Now Y value is: "+ y);
		

	}

}
