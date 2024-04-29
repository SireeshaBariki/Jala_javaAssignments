package access_modifiers;


/* Create a class with DEFAULT fields and methods. Access these fields and methods 
from any other class in the same package */
 class Default_fields {

	int myage;
	String name;
	
	void defaultMethod()
	{
		System.out.println("My Name is " + name + " and my age is " + myage);
	}

	}


