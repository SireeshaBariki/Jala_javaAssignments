package loops;

import java.util.Scanner;

public class Even_Odd_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number ");
int num=sc.nextInt();
switch(num%2)
{
case 0:System.out.println("Even number" + num);
break;
case 1:System.out.println("Odd number " + num);
break;

}	
	}

}
