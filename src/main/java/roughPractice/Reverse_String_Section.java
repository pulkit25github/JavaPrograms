package roughPractice;

public class Reverse_String_Section {

	public static void main(String[] args) 
	{
		
		String str = "My name is pulkit and India is my country";
		String rev= "";
		
		String split [] = str.split("and");
		
		for (int i=split.length-1; i>=0; i--)
		{
			
			rev = rev + split[i] + " and ";
		    
		}
		rev = rev.substring(0, 42);
		System.out.println(rev);
		
		
		

	}

}
