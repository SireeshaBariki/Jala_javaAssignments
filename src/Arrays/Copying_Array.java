package Arrays;

import java.util.Arrays;

public class Copying_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		System.out.println("The length of an Original Array is: " +(a.length));
		System.out.println("Original Array: " + Arrays.toString(a));
		int Copyarray[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			Copyarray[i]=a[i];
			
		}
		System.out.println("Copy Array :" +Arrays.toString(Copyarray));
	}

}
