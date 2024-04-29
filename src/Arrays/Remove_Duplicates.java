package Arrays;

import java.util.Arrays;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,3,4,4,5,6,6,7};
		System.out.println("The length of an Original Array before removing Dupliactes is: " +(a.length));
		//System.out.println("Original Array: " + Arrays.toString(a));
		int temp[]=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
		if(a[i]!=a[i+1])
		{
			temp[j++]=a[i];
		}
		}	
		temp[j++]=a[a.length-1];
		
		for(int k=0;k<j;k++)
		{
		System.out.print(temp[k] +" ");
		}
				
	}
		
		
}
