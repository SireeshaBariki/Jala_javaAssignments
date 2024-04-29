package exceptions;

public class ClassNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            Class.forName("com.exceptions.jala");
	            ClassLoader.getSystemClassLoader().loadClass("com.exceptions.jala");

	        } catch (ClassNotFoundException e) {
	            /* printStackTrace() prints the throwable Exception object as well as with other Information
	            like the line number where Exception occurs and class name where the exception occurred.*/
	            e.printStackTrace();
	        }
	}

}
