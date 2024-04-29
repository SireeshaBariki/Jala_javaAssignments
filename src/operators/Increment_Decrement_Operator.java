package operators;

import java.util.Scanner;

public class Increment_Decrement_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);// Accepts the value from user
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		/*
		 * System.out.println("The value after incrementing is :" +(++a));//11
		 * System.out.println("The value after decrementing is :"+(--a));//10
		 */
		/*
		 * int b=++a; System.out.println(b);//11
		 */
		int b = a++;
		System.out.println(b);// 10
		System.out.println(a);// 11
	}

}
