package exceptions;

public class ArrayIndexOutofBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]= {10,20,30,40,50};
 //System.out.println(a[5]);
/*It throws an exception as Index 5 out of bounds for length 5
	at exceptions.ArrayIndexOutofBoundsException.main(ArrayIndexOutofBoundsException.java:8)*/
 
 /*try
 {
	 System.out.println(a[5]); 
 }
 catch(ArrayIndexOutofBoundsException e)
 {
	 System.out.println("ArrayIndexOutOfBoundsException caught");
 } */
//Declaring 4 elements in the String array
String[] arr = {"Sharan", "Rahul", "Leo", "Arun"};
//ArrayIndexOutOfBoundException because there is no 5th index
try {
    System.out.println(arr[5]);
}
catch (ArrayIndexOutOfBoundsException e){
    System.err.println("ArrayIndexOutOfBoundsException caught");
    /* printStackTrace() prints the throwable Exception object as well as with other Information
    like the line number where Exception occurs and class name where the exception occurred.*/
    e.printStackTrace();
}
	}

}
