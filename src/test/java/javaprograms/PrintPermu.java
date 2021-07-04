package javaprograms;

public class PrintPermu 
{

	// Function to print all the permutations of str
    static void permu(String str, String ans)
    {
  
       // If string is empty
        if (str.length() == 0) 
        {
            System.out.print(ans + " ");
            return;
        }  
  
        for (int i = 0; i < str.length(); i++) {
  
            /* select ith character of str (eg: abcde f ghjij)........ f is ith character
        	   
        	   now to select a to e......use substring (0, i)
        	   to select g to j.......use substring (i + 1)  
        	 */
        	
            char ch = str.charAt(i);
  
            // Rest of the string after excluding the ith character
            
            String ros = str.substring(0, i) + str.substring(i + 1);
           
  
            // Recurvise call
            permu(ros, ans + ch);
        }
    }
  
    // Driver code
    public static void main(String[] args)
    {
        String s = "abc";
        permu(s, "");
    }
}