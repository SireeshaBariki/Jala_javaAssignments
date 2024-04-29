package exceptions;

public class MethodthrowsException {
	 static void throwException() {
	        //throw keyword is used to invoke an exception explicitly.
	        throw new RuntimeException("Throwing exception");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* We can throw either checked or unchecked exceptions in Java by throw keyword.
		It is mainly used to throw a custom exception. */
		throwException();
		
	}

}
