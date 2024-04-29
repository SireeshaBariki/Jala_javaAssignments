package access_modifiers;

/*Create a class with PRIVATE fields, private method and a main method. Print the fields 
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class */

public class Private_fields {
	
	//private fields 
	private int age=30;
	private String name ="Yashu";
	
	//private method
	private  void pvtMethod()
	{
		System.out.println("My Name is " + name + " and my age is " + age);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private_fields test2 =new Private_fields();
		System.out.println(test2.age);
		System.out.println(test2.name);
		test2.pvtMethod();
	}
	// NOTE : A subclass does not inherit the private members of its parent class
}
