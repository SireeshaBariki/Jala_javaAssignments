package Arrays;

public class Add_Integer_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50};
System.out.println("The length of an array is: "+(a.length));
int sum=0;
for(int i=0;i<=a.length-1;i++)
{
sum=sum+a[i];
}
System.out.println("The sum of array is: "+sum);		
	}

}
