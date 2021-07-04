package javaprograms;

public class ReverseSpecificString {

	public static void main(String[] args) {
		
	// Program to specific  word from sentence
		
		String rev = "My name is Java";
		// convert String to character array
		// by using toCharArray
	
		String final_rev = rev.substring(3, 7);
		
	//	 System.out.print(final_rev); 
		
		char[] reverse = final_rev.toCharArray();
		for (int i = reverse.length - 1; i >= 0; i--)
	     {
		  System.out.print(reverse[i]);     
		   }
		
		
		
		
		
		
		
		
		
		        
	}

}
