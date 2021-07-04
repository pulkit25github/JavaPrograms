package roughPractice;

public class SubString {

	public static void main(String[] args) 
	{
		
		String str = "My name is Best person pulkit";
		
		String newSt = str.substring(0, 10) ;
        System.out.println(newSt);
		
        String newSt2 = str.substring(23, 29) ;
        System.out.println(newSt2);
        
        System.out.println(newSt +" "+ newSt2);
	}

}
