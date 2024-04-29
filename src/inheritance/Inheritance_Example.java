package inheritance;
/*	1.A, B and C are classes
    2.A is a super class. B is a sub class of A. C is a sub class of B. 
    3.Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C
    4.Create a class with main method. Create an object for each class A, B and C in main method and call every method of each class using its own object/instance.
    5.Call an overridden method with super class reference to B and C class’s objects
    6.Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data member*/

class A
{    
	int a=10;
     void methodA1()
     {
    	 System.out.println("This is class A methodA1");
     }
     void methodA2()
     {
    	 System.out.println("This is class A methodA2");
     }
     void method3()
     {
    	 System.out.println("This is override method class A ");
     }
	}
class B extends A
{     int b=20;
      void methodB1()
{
	 System.out.println("This is class B methodB1");
}
void methodB2()
{
	 System.out.println("This is class B methodB2");
}
void method3()
{
	 System.out.println("This is override method class B ");
}
	
	}
class C extends B
{
	int c=30;
    void methodC1()
    {
   	 System.out.println("This is class C methodC1");
    }
    void methodC2()
    {
   	 System.out.println("This is class C methodC2");
    }
    void method3()
    {
   	 System.out.println("This is override method class C ");
    }
	}





public class Inheritance_Example {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1=new A();
		obj1.methodA1();
		obj1.methodA2();
		obj1.method3();
		
		B obj2=new B();
		obj2.methodB1();
		obj2.methodB2();
		obj2.method3();
		
		C obj3=new C();
		obj3.methodC1();
		obj3.methodC2();
		obj3.method3();
		
// Call an overridden method with super class reference to B and C class’s objects
		
		A test1;
		//upcasting
		test1=new B();
		test1.method3();
		
		//upcasting
		test1=new C();
		test1.method3();
		
		//Runtime Polymorphism with Data Members
        A rtp;
        rtp = new A();
        System.out.println(rtp.a);
      /*  rtp = new B();
        System.out.println(rtp.b);
        rtp = new C();
        System.out.println(rtp.c); */
		
       System.out.println(obj3.a); 
       System.out.println(obj3.b); 
       System.out.println(obj3.c); 
        
	}

}
