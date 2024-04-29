package Arrays;

public class Even_Odd_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8,9,10};
for(int i:a)
{
	System.out.println("The Even numbers in the given array are");
	if(i%2==0)
		{
		System.out.println(i);
		}
	System.out.println("The Odd numbers in the given array are");
	for(int j:a)
	{
		if(j%2!=0)
			{
			System.out.println(j );
			}	
	}
	}

}}
