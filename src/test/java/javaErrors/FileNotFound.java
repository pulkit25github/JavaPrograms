package javaErrors;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) throws FileNotFoundException 
	{
		 // Following file does not exist
        File file = new File("D:\\selenium\\abc.txt");

        FileReader fr = new FileReader(file);

		
		
		
		
		
		
		
		
	}

}
