package javaprograms;

public class ReverseString {

	public static void main(String[] args)
	{
		String s = "Selenium";     // String is immutable
		
		//1. Using for loop
		
		String rev= "";
		
		int len = s.length(); // 8  ...index=7(m)
		
		for (int i= len-1; i>=0 ; i-- )
		{
			rev= rev + s.charAt(i);      // rev= blank + m
		}

		System.out.println(rev);
	
        System.out.println("**********");
        
	//2, Using String Buffer (it is mutable) using reverse function *****************

        String str = "JavaScript";
		StringBuffer sb= new StringBuffer(str); 
		sb.reverse();
		System.out.println(sb);
	
	  
	}	  
	
}
