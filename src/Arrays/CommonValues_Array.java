package Arrays;

public class CommonValues_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1[]= {10,20,30,40,50};
System.out.println("The length of the a1 Array is :" +a1.length);

int a2[]= {1,2,30,20,50};
System.out.println("The length of the a2 Array is :" +a2.length);

for(int i=0;i<a1.length;i++)
{
	for(int j=0;j<a2.length;j++)
	{
		if(a1[i]==a2[j])
		{
			System.out.println("The common values of both the arrays :" +a1[i]);
		}
			
	}
		}
	}

}
