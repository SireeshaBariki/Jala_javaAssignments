package Arrays;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		System.out.println("The length of an array is: " +(a.length));
		System.out.println("Original Array: " + Arrays.toString(a));
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i] + " ");
		}
		
	}

}
