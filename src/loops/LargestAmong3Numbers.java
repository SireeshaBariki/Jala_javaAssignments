package loops;

import java.util.Scanner;

public class LargestAmong3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First number: ");
int a=sc.nextInt();
System.out.println("Enter the Second number: ");
int b=sc.nextInt();
System.out.println("Enter the Third number: ");
int c=sc.nextInt();

if(a>b && a>c)
{
	System.out.println("Largest Number is " +a);
}
else if(b>a && b>c)
{
	System.out.println("Largest Number is " +b);
}
else
{
	System.out.println("Largest number is "+c);
}
	}

}
