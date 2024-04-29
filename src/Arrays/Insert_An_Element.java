package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_An_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60,70};
		System.out.println("The length of an Original Array before inserting Element is: " +(a.length));
		System.out.println("Original Array: " + Arrays.toString(a));
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the index number: ");
		int pos=sc.nextInt();
		System.out.print("Enter the value to be inserted in the index number: ");
		int num=sc.nextInt();
		int newarray[]= new int[a.length+1];
		for(int i=0;i<a.length+1;i++)
		{
			if(i<pos)
			{
			newarray[i]=a[i];
			}
			else if(i==pos)
			{
				newarray[i]=num;
			}
			else 
			{
				newarray[i]=a[i-1];
			}
		}
		System.out.println("After inserting the value :" +Arrays.toString(newarray));
	}
	}


