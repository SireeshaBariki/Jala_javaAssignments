package interfaces;
//Create an interface and inherit it from the other interface
 interface b1
 {
	void m1(); 
 }
 interface b2 extends b1
 {
	void m2();
 }
public class Interface_Inheritance implements b2{
 public void m1()
 {
	 System.out.println("This is First Method");
	 
 }
 public void m2()
 {
	 System.out.println("This is Second Method");
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Inheritance inherit =new Interface_Inheritance();
	inherit.m2();
	inherit.m1();
	}

}
