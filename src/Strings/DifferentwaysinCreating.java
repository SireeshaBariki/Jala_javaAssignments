package Strings;

public class DifferentwaysinCreating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// Creating a string literal and placed in memory "string constant pool"
		String s1 = "This is a string";
        System.out.println(s1);

        //new instance is created (SCP and Heap) along with one reference.
        String s2 = new String("Creating a string object and placed in memory \"Heap\"");
        System.out.println(s2);
	}

}
