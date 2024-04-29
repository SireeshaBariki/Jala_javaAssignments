package this_super;

//superclass
class abc
{
	String name = "Sireesha";
     int a=10;
    abc() //Constructor
    {
        System.out.println("This is parent class constructor");
    }	
}

//subclass
class xyz extends abc
{
	String name = "Swapna";
    int b=20;
    xyz() //Constructor
   {
    	super();//Calling constructor of the parent class using super()
       System.out.println("This is child class constructor");
   }	
    void myMethod() {
        //Printing fields of the parent class using super
        System.out.println("My name is " + super.name);
}

public class Call_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        xyz callsuper=new xyz();
        callsuper.myMethod();
	}

}}
