package interfaces;
/*Create a PUBLIC interface with fields and methods, fields should have values assigned. 
Implement this interface to some class and print the values of the interface fields and 
call the interface method */

public interface xyz
{
int x=10;
 public void m1();
}
 class Public_Interface implements xyz {
	 public void m1() 
	 {
	        System.out.println("This is a method");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Public_Interface j=new Public_Interface();
		System.out.println(x);
		j.m1();
	}

}
