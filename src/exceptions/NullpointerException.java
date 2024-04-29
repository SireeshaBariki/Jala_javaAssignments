package exceptions;

public class NullpointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String y=null;

try 
{
	System.out.println(y.length());	
}
catch(NullPointerException e)
{
System.out.println("NullPointerException Caught");	
}
	}

}
