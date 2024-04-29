package javaio;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadUsingInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // FileInputStream is a subclass of InputStream
            //file path passed as parameter to the FileInputStream constructor.
            InputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop Hi.txt");
            int i;
            //If the read() method returns -1, there is no more data to read in the FileInputStream
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            // Closes the input stream
            fis.close();
        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.getStackTrace();
        }
	}

}
