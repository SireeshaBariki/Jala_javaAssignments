package operators;

import java.util.Scanner;

public class SmallOrLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//Accepts the value from user

		System.out.println("Enter the First number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		 
		if (a>b)
		{
			System.out.println("The largest number is " +a);
		
		}
		else
		{
			System.out.println("The Smallest number is " +a);	
		}
		if (b>a)
		{
			System.out.println("The largest number is " +b);
		
		}
		else
		{
			System.out.println("The Smallest number is " +b);	
		}
			
	}
	

}
