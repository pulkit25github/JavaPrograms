package javaprograms;

import java.util.Scanner;

public class Lengthof_string {

	
	public static void main(String[] args) 
	{
		
		// create object of string and scanner class.
				String text;
				Scanner SC=new Scanner(System.in);

				System.out.print("Enter the string : ");
				text=SC.nextLine();
					
				// find string length
				int length = text.length();
				// print length.
				System.out.println("Length of the given string " + text+ " is : " +length );
			}
		}

		