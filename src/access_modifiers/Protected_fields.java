package access_modifiers;


/* Create a class with PROTECTED fields and methods. Access these fields and methods 
from any other class in the same package. 
Also, Access the PROTECTED fields and methods from child class located in a different 
package
Access the PROTECTED fields and methods from any class in different package */
public class Protected_fields {

	protected String name;
	protected int age;
	 protected void protectedmethod()
	 {
		System.out.println("My Name is " + name + " and my age is " + age) ;
	 }
	
	
	}


