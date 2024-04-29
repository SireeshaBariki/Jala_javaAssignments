package interfaces;

interface ABC
{
int x=100;	
void m1();
}

interface XYZ
{
int y=200;
void m2();
}
public class Two_interface_OneMethod implements ABC,XYZ {

	public void m1()
	{
		System.out.println("The value of x is :" +x);
		System.out.println("The is first method ");
	}
	public void m2()
	{
		System.out.println("The value of y is :"+y);
		System.out.println("The is second method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_interface_OneMethod twoobj =new Two_interface_OneMethod();
		twoobj.m1();
		twoobj.m2();
	}

}
