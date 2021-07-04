package roughPractice;


public class ReverseNumberWithZeros 
{

	   public static void main(String[] args) {
	      
		   int num= 01230;
		   
		   //Declare int without starting 0
		   int num1 = 1230;
		   
		   String str =String.format("%05d",num1);  
		   
		   System.out.println(str);  // output 01230

		   StringBuffer sb = new StringBuffer();
		   
		   String valueReversed = sb.append(str).reverse().toString();

		   System.out.println("Reversed numbers are: " + valueReversed);

		}	  
		  
	   }
	