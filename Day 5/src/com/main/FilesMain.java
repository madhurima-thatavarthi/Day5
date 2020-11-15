package com.main;

import java.io.File;
import java.util.Scanner;


/**
 * 
 * Handling a checked exception by opening a file
 * 
 * Write a code opens a text file and writes its content to the standard output.
 * What happens if the file doesn’t exist
 * 
 * @author Kavya Madhurima
 *
 */
public class FilesMain {
   public static void main(String[] args)
   {
	   Scanner sc=null;
	   File file=null;
	   String data;
	   
	   try {
		   file=new File("D:\\Softwares\\grid.txt");
		   sc=new Scanner(file);
		   while(sc.hasNextLine())
		   {
			   data=sc.nextLine();
			   System.out.println(data);
		   }
		   
	   }
	   catch(Exception e)
	   {
		   
		   System.out.println("File doesn't exists");
	   }
	   finally
	   {
		   file=null;
		   sc.close();
	   }
	   
   }
}
