package collections;

import java.util.HashSet;

public class Hashset_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> abc= new HashSet <String>();

//adding elements
abc.add("One");
abc.add("Two");
abc.add("Three");
abc.add("Four");
abc.add("Five");
abc.add("Six");
abc.add("Seven");
abc.add("Eight");
abc.add("Nine");
abc.add("Ten");
abc.add("One"); //Duplication is not allowed

System.out.println(abc);

//Insertion is not possible
//Get specific values not possible
//Read all the data from Hashset
for(String i:abc)
{
	System.out.print(i + " ");
	}
// Create a clone/copy of HashSet using clone() method
System.out.println("clone/copy of HashSet : ");
System.out.println(abc.clone());

// Removing a specific element using remove() method
abc.remove("Nine");
System.out.println("After removing element 'Nine' :" +abc);


//Checking if the set is empty using isEmpty() method
System.out.println("Checking if the set is empty : " +abc.isEmpty());



//Finding the size of the HashSet using size() method
System.out.println("Size of the HashSet : " +abc.size());


//Checking if element is present in the HashSet using contains() method
System.out.println("Element 'One' is present in the HashSet : "+abc.contains("One")); //returns boolean value
 

//Removing all elements of the HashSet using clear() method
abc.clear();
System.out.println("After removing all elements of the HashSet :" +abc);



	}

}
