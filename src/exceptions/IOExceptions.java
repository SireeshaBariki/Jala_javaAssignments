package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fis.read();
            fis.close();
        }
        //FileNotFoundException is a subclass of IOException.
        catch (IOException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
	}

}
