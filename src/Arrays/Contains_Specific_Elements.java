package Arrays;

import java.util.Scanner;

public class Contains_Specific_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {11, 22, 12, 33, 44, 23, 55};
Scanner sc=new Scanner(System.in);
System.out.println("Enter value to verify(n1 & n2) ");
int n1=sc.nextInt();
int n2=sc.nextInt();
for(int i:a)
{
	if(i==n1)
	{
		System.out.println(n1 +  "It is present in the array ");
	}
}
for(int j:a)
{
	if(j==n2)
	{
		System.out.println(n2 +  "It is present in the array ");
	}
}
	}

}
