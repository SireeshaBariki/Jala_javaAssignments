package exceptions;

public class Arithmetic_Exception {
/*1. Write a program to generate Arithmetic Exception without exception handling
  2. Handle the Arithmetic exception using try-catch block  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=0,c;

try
{
	System.out.println("Inside try block");
    //below code throws / by zero exception
    c = a / b;
    System.out.println("c = " + c);	
}
// 2. Handles the Arithmetic Exception
catch(ArithmeticException e)
{
System.out.println("Entered into the catch block");	
}
/*c=a/b;
System.out.println("Without exception handling"); */
	}

}
