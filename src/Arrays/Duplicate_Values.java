package Arrays;

import java.util.Arrays;

public class Duplicate_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,20,40,50,50};
		System.out.println("The length of an Original Array before inserting Element is: " +(a.length));
		System.out.println("Original Array: " + Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println("Duplicate value in an array is:" +a[i]);
			}
		}
			
	}

}
