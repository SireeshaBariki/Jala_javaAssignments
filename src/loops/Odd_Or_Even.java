package loops;

import java.util.Scanner;

public class Odd_Or_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=num.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is even");
			}
		else
		{
			System.out.println("The number is Odd");
			}
	}

}
