package interfaces;
/* Create an interface with only one method and implement it in a class. Call the method 
implemented  */

//An interface is declared by using the interface keyword.
interface shape
{
	void oneMethod();//An abstract method doesn't have its body, and they are public and abstract
}
public class Interface_OneMethod implements shape {

	
	public void oneMethod()
		{
		System.out.println("This is a method");
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_OneMethod test= new Interface_OneMethod();
		test.oneMethod();
	}

}
