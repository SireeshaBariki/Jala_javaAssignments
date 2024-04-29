package exceptions;

public class NumberformatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x="abc";
try
{
	System.out.println("Inside try block");
    //below code throws / by zero exception
    int num=Integer.parseInt(x);
    
}
// 2. Handles the Arithmetic Exception
catch(NumberFormatException e)
{
System.out.println("Entered into the catch block");	
e.printStackTrace();
}
	}

}
