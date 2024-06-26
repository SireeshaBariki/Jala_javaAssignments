package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            // create instance of the BufferedReader and pass the FileReader instance to it.
	            BufferedReader reader = new BufferedReader (new FileReader(new File("/invalid/file/location")));
	        }
	        //FileNotFoundException is a subclass of IOException.
	        catch (FileNotFoundException e) {
	            System.err.println("FileNotFoundException caught!");
	            /* printStackTrace() prints the throwable Exception object as well as with other Information
	            like the line number where Exception occurs and class name where the exception occurred.*/
	            e.printStackTrace();
	        }
	}

}
