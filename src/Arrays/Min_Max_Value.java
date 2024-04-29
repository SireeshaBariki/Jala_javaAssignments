package Arrays;

import java.util.Arrays;

public class Min_Max_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,8,46,53,1,99};
		System.out.println("The length of an Original Array before inserting Element is: " +(a.length));
		System.out.println("Original Array: " + Arrays.toString(a));
		int max=a[0],min=a[0];
		for(int i=1;i<a.length;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
		
		}
		System.out.println("The Maximum value in an Array is:" +max);
		System.out.println("The Minimum value in an Array is:" +min);
		}
	

}
