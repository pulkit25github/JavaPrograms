package javaprograms;

import java.util.Scanner;

public class Transpose_matrix {

	
	public static void main(String[] args) 
	{
	
		  int r, c, x, y;
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number of columns and rows of matrix");
	      
	      r = sc.nextInt();
	      c = sc.nextInt();
	 
	      int matrix[][] = new int[r][c];
	      System.out.println("Enter the elements of matrix");
	      for ( x = 0 ; x < r ; x++ )
	         for ( y = 0 ; y < c ; y++ )
	            matrix[x][y] = sc.nextInt();
	 
	      
	      int transpose[][] = new int[c][r];
	      for ( x = 0 ; x < r ; x++ )
	      {
	         for ( y = 0 ; y < c ; y++ )               
	            transpose[y][x] = matrix[x][y];         
	      }
	      System.out.println("Transpose of entered matrix:-");
	 
	      for ( x = 0 ; x < c ; x++ )
	      {
	         for ( y = 0 ; y < r ; y++ )
	        	 
	        System.out.print(transpose[x][y]+ "\t");    // /t means spaces
	 
	            System.out.print("\n");           // 
	      }
		

	}

}
