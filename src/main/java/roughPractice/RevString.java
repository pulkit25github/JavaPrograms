package roughPractice;

public class RevString {

	public static void main(String[] args)
	{
		
		String str1 = "Selenium";
		String rev1= "";
		

		int lenSel= str1.length();
	//	int lengthSt= str2.length();
		//logic 1: for loop
	
		for (int i=lenSel-1; i>=0; i--)
		{
			
			rev1 = rev1 + str1.charAt(i);
		
		}
		System.out.println(rev1);
		
		System.out.println("*******REVERSE SPECIFIC STRING ONLY*****");
		
        String s1 = "India is my best country";
		
		String revWord = s1.substring(11, 16);
		String fin = "";
		
		
		
		for (int i= revWord.length()-1; i>0;  i--)
		{
			
			fin = fin + revWord.charAt(i); 
		
		}
		
		fin = s1.replaceAll("best", fin);
		
		System.out.println(fin);

	}

}
