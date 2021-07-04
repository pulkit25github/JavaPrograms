package roughPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class Zpractice2 
{

	    public static void main(String[] args) throws IOException 
	    {
	    
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the number");
	    	
	    	int num =sc.nextInt();
	    	
	    	int rem;
			int cube= 0;
			int temp;
			
			temp = num;
			
			while (num>0)
			{
				rem = num%10;
				num = num/10;
				cube = cube + (rem * rem * rem);
			}
			
			if(temp == cube)
			{
				System.out.println("Number is armstrong");
			}
			else
			{
				System.out.println("Number is not armstrong");
			}

	    
		}
		}
 