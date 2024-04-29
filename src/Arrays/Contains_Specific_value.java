package Arrays;

import java.util.Scanner;

public class Contains_Specific_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		System.out.println("the length of an array is: " +(a.length));
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
				System.out.println(n +" is Present in the givem array ");
			}
	}

}
