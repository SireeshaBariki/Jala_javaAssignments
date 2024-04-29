package loops;

import java.util.Scanner;

public class ArmstrongNumber_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//Accepts the value from user
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int result=0,r,temp;
		temp=num;		
		while(num!=0)
		{
			r=num%10;
			result+=(r*r*r);
			num=num/10;
			}
		
		if(temp==result)
		{
			System.out.println("The number is Armstrong ");
					}
		else 
		{
			System.out.println("The number is not a Armstrong ");
		}
	
	}

}
