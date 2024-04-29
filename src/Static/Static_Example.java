package Static;

public class Static_Example {
	/*  1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
	methods and a main method.
	2. Print instance variables in static methods
	3. Print static variables in Instance methods
	4. Call instance methods in static methods
	5. Call static methods in instance methods
	6. Print all the static, instance variables in main method
	7. Call static methods and instance methods in main method     */
	
	//Static Variables
	 static int a=10;
	 static int b=20;
	 
	 //Instance variables
	 
	 int x=100;
	 int y=200;
	 
	 //Static Methods Print instance variables in static methods
	 static void staticmethod1()
	 {
		 Static_Example obj=new Static_Example();
		 System.out.println("Print instance variables in static methods");
		 System.out.println("Instance Variables: " +obj.x+ " , " +obj.y);
	 }
	 //3.Print static variables in Instance methods
	 void instancemethod1()
	 {   
		 System.out.println("Print static variables in Instance methods");
		 System.out.println("Static Varaibles :" +a+"  ," +b);
	 	 }	 
	 //4. Call instance method1 in static method2
	 static void staticmethod2()
	 {
		 Static_Example obj=new Static_Example();
		 obj.instancemethod1();
		 
		 }
	 
 //5. Call static methods in instance methods
  void instancemethod2()
 {   
	  staticmethod1();
  }

	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Static_Example test=new Static_Example();
     // 6. Print all the static, instance variables in main method
      System.out.println("Instance Variables: " +test.x+ " , " +test.y);
      System.out.println("Static Varaibles :" +a+"  ," +b);
      
      //7. Call static methods and instance methods in main method
      //static methods
      staticmethod1();
      staticmethod2();
      //Instance methods
      test.instancemethod1();
      test.instancemethod2();
	}

}
