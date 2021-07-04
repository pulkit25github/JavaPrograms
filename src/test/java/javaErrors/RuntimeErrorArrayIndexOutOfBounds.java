package javaErrors;

public class RuntimeErrorArrayIndexOutOfBounds {

	public static void main(String[] args) 
	{
		
		int arr[] = {5,4,8,7,9};
		  
        // Array size is 5
        // whereas this statement assigns
  
        // value 250 at the 10th position.
     
		System.out.println(arr[3]);  // value is 7
		arr[3] = 25;    // change to 25
		System.out.println(arr[3]); 
		
		arr[9] = 50;         //no value is present at 9th index
		
		
		
		
		
		
	}

}
