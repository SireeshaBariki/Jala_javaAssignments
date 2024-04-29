package loops;

import java.util.Scanner;

public class Male_Female_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character(M/F) :");
char Gender=sc.next().charAt(0);
switch  (Gender){
	case 'M':System.out.println("Gender is Male");
	break;
	case 'F':System.out.println("Gender is Female");
	break;
	
}
	}

}
