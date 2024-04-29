package interfaces;
 interface jala
 {
	default void m1() //default method needs a body
	{
		System.out.println("This is a default method");
 }
 }
public class Interface_DefaultMethod implements jala {
	
	//Didn't provide implementation to the default method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_DefaultMethod obj=new Interface_DefaultMethod();
		obj.m1();
		
	}

}
