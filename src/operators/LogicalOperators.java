package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Works between 2 or more boolean values
				// returns true/false
				
				boolean x=true;
				boolean y=false;
						
				System.out.println(x && y); // false
				System.out.println(x || y); // true
				System.out.println(!x); // false
				
				boolean b1=10>20;   //false
				boolean b2=20>10;   //true
				
				System.out.println(b1 && b2);  //false
				System.out.println(b1 || b2);  //true
	}

}
