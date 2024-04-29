package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> mylist=new ArrayList <String>();
// Adding elements to the ArrayList using add method using add() method
// Duplicate Elements are allowed
// multiple null values are allowed
mylist.add("Mango");
mylist.add("Apple");
mylist.add("Pineapple");
mylist.add("Jackfruit");
mylist.add("Watermelon");
mylist.add("Strawberry");
mylist.add("Apple");
mylist.add("Custardapple");
mylist.add("Apricot");
mylist.add("Grapes");

//Size of an ArrayList
System.out.println("Size of an arraylist is :" +mylist.size());

//Read all elements from array list
for(String x:mylist )
{
	System.out.println(x);
	}  

//Add an element at a specific index

mylist.add(2,"muskmelon"); 
System.out.println("After inserting element at index 2 : " +mylist);


//Remove an element from the ArrayList, Remove at an index

mylist.remove(2);
System.out.println("After removing element from index 2 :"  +mylist) ;

//Update the element at a specific index

mylist.set(0, "Banana");
System.out.println("After updating element from index 0 :"  +mylist) ;


 //Check the element is present at a particular index
System.out.println("Checking whether the element is present in the index :" +mylist.indexOf("Pineapple"));
//System.out.print(mylist.indexOf("Banana"));


//Get an element at a particular index

System.out.println("Get an element from the particular index :" +mylist.get(2));

//Check the given element is present in the ArrayList (Returns a boolean value)

System.out.println("Checking whether the Strawberry is present in the ArrayList :" +mylist.contains("Kiwi"));

// Remove all elements of the ArrayList
mylist.clear();
System.out.println("After removing all the elements from an array "  +mylist);

		/* passing an Array converted to List using the asList() method
        java.util.ArrayList<String> jala = new java.util.ArrayList<>(
                Arrays.asList("zero", "one", "two", "three", "four", "five"));
        System.out.println("\njala = " + jala);

        //a. adding elements to the ArrayList using add method using add() method
        jala.add("six");
        jala.add("seven");
        jala.add("eight");
        jala.add("nine");
        System.out.println("\nAfter adding elements :");
        System.out.println("jala = " + jala);  
      //b. Iterating through the ArrayList by using Iterator object
        Iterator<String> itr = jala.iterator();
        System.out.println("\nIterating through the ArrayList : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");  */

	}

}
