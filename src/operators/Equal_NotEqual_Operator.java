package operators;

import java.util.Scanner;

public class Equal_NotEqual_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//Accepts the value from user

		System.out.println("Enter the First number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
	}

}
