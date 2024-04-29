package loops;

import java.util.Scanner;

public class palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//Accepts the value from user
		System.out.print("Enter the number:");
		int num=sc.nextInt();

		int rev=0,temp;
		temp=num;		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			}
		System.out.println("Reverse number is:"+rev);
		if(temp==rev)
		{
			System.out.println("The number is palindrome ");
					}
		else 
		{
			System.out.println("The number is not a palindrome ");
		}
	
	}

}
