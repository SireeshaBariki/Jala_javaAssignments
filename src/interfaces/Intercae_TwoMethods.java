package interfaces;

interface Animal
{
	
void firstmethod();
void secondmethod();

}


public class Intercae_TwoMethods implements Animal {
public void firstmethod()
{
	System.out.println("This is First Method");
	
}
public void secondmethod()
{
	System.out.println("This is Second Method");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intercae_TwoMethods twoobjs=new Intercae_TwoMethods();
		twoobjs.firstmethod();
		twoobjs.secondmethod();
		// A class that implements an interface must implement all the methods declared in the interface.
		//cannot implement only one method in a class
	}

}
