package constructors;

/*Write a class with a default constructor, one argument constructor and two argument 
constructors. Instantiate the class to call all the constructors of that class 
from a main class */
 
class Default_Constructor {
	//Default_Constructor()	
			Default_Constructor()
			{
				System.out.println("Student details");
			}
		//One argument Constructor
			Default_Constructor(String name)
			{
				System.out.println("Student name: "+name);
			}
			//Two argument Constructor
			Default_Constructor(String name,int id)
			{
				System.out.println("Student details :" +name +" "+ id);
			}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Default_Constructor abc=new Default_Constructor();
		new Default_Constructor("satish");
		new Default_Constructor("satish",103);
		
		
		

		
		
	}

}
