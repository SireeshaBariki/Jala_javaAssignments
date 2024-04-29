package methodoverloading;

/*1. Write two methods with the same name but different number of parameters of same type 
and call the methods from main method
2. Write two methods with the same name but different number of parameters of different 
data type and call the methods from main method
3. Write two methods with the same name and same number of parameters of same type 
and call from main method
4. Write two methods with the same name and same number of parameters of different 
type and call from main method
5. Write two methods with the same name, number of parameters and data type but 
different return Type   */
public class Method_overloading {
/*The compiler does not consider the return type while differentiating the overloaded method.
      But you cannot declare two methods with the same signature and different return types.
      It will throw a compile-time error.  */	
//Two methods with the same name but different number of parameters of same data type
	void method1(int num1)
	{
		System.out.println("First number :" +num1);
	}
	void method1(int num1 , int num2)
	{
		System.out.println("Sum of two numbers :"+(num1+num2));
	}
	
//Two methods with the same name but different number of parameters of different data type
	void method2(int rollno)
	{
		System.out.println("Roll Number :" +rollno);
	}
	void method2(int rollno , String name)
	{
		System.out.println("Details of the student :" +rollno +" " +name);
	}
	
/*We can not define more than one method with the same name, Order, 
  and type of the arguments. It would be a compiler error. */	
	
//	Two methods with the same name and same number of parameters of different data type 
	
	void method3(int rollno )
	{
		System.out.println("Roll Number :" +rollno);
	}
	void method3( String name)
	{
		System.out.println("Name of the student :"  +name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_overloading mo=new Method_overloading();
		mo.method1(123);
		mo.method1(123,156);
		mo.method2(167);
		mo.method2(167,"Yashu");
		mo.method3(195);
		mo.method3("Anil");
		
		
	}

}
