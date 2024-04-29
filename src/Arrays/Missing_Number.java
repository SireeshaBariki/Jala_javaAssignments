package Arrays;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,5,6,2,4,9,10,8};
System.out.println("The length of an array is :" +(a.length));
int n=a.length+1;
int sum=(n*(n+1))/2;
for(int i=0;i<a.length;i++)
{
	sum=sum-a[i];
}
System.out.println("Missing number is:" +sum);
	}

}
