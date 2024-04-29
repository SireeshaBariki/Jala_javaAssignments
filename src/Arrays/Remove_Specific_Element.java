package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Specific_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		System.out.println("the length of an array is: " +(a.length));
		System.out.println("Original Array: " + Arrays.toString(a));
		Scanner sc=new Scanner(System.in);
		System.out.print("Select an index to remove from an Array :");
		int n=sc.nextInt();
		if(a==null||n<0||n>a.length)
		{
			System.out.println("we cannot remove an Element");
		}
		int newa[]=new int[a.length-1];
		
		for(int i=0,k=0;i<a.length;i++)
		{
			if(i==n)
				continue;
			newa[k++]=a[i];
		}
		System.out.println("Array after removing elements is:" +Arrays.toString(newa));
	}

}
