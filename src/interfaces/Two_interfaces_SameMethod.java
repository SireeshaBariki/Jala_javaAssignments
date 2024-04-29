package interfaces;
/* Create two interfaces with the same method (same signature) in both the interfaces. 
Implement these two interfaces in one class. Call the method.
 */

interface s
{
void m1();
}

interface a
{
void m1();	
}
public class Two_interfaces_SameMethod implements s,a {

	public void m1()
	{
		System.out.println("This is same method in both the interfaces");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_interfaces_SameMethod smethod=new Two_interfaces_SameMethod();
		smethod.m1();
	}

}
