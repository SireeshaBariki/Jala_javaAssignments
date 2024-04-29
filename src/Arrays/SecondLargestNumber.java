package Arrays;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int a[]= {1,4,5,35,34};
int size=a.length;
if(size<2)
    {
	System.out.println("Invalid Input");
	}
Arrays.sort(a);
System.out.println(a[size-2]);*/

//If there are any repetitive numbers
		int a[]= {1,4,5,35,34};
		int size=a.length;
		if(size<2)
		    {
			System.out.println("Invalid Input");
			}
		Arrays.sort(a);
		System.out.println(a[size-2]);
for(int i=size-2; i>=0; i--)
{
	if(a[i]!=a[size-1])
	{
		System.out.println("The second largest number is :" +a[i]);
		return;
	}
	System.out.println("There is no second largest number");
}

	}

}
