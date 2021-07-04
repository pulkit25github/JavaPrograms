package javaprograms;

import java.util.Arrays;
import java.util.Collections;

public class PlaceAllZerosToEnd {

	
	static void moveZerosToEnd(int arr[], int len) {
	     
	    // Count of non-zero elements
	    int count = 0;
	    int temp;
	 
	    // Traverse the array. If arr[i] is
	    // non-zero, then swap the element at
	    // index 'count' with the element at
	    // index 'i'
	    for (int i = 0; i < len; i++)
	    {
	    if ((arr[i] != 0)) 
	    {
	        temp = arr[count];
	        arr[count] = arr[i];
	        arr[i] = temp;
	        count = count + 1;
	    }
	    }
	}    
	    // function to print the array elements
	static void printArray(int arr[], int len) 
	{
	    for (int i = 0; i < len; i++)
	    System.out.print(arr[i] + " ");
	} 
	
	// Driver program to test above
	public static void main(String args[]) {
	    int arr[] = {0, 1, 9, 8, 4, 0, 0, 2,
	                         7, 0, 6, 0, 9};
	    int len = arr.length;
	 
	    moveZerosToEnd(arr, len);
	    printArray(arr, len);
		
	}
	}