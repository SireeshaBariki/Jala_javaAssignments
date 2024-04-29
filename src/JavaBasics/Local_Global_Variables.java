package JavaBasics;

public class Local_Global_Variables {

	int a = 10;

	void localvaraibles() {
		int a = 100;
		System.out.println("Local varaible a :" + a);
	}

	public static void main(String[] args) {

		Local_Global_Variables obj = new Local_Global_Variables();
		obj.localvaraibles();
		System.out.println(obj.a);

	}

}
