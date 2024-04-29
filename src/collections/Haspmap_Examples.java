package collections;

import java.util.HashMap;

public class Haspmap_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Data can be stored in the form of key,value pairs
//Key is unique but we can have duplicate values
//Insertion order not preserved(index not allowed)
//If you try to insert the duplicate key, it will replace the element of the corresponding key
		HashMap<Integer, String> xyz=new HashMap<Integer, String>();
		
//1.Insert a Key value mapping into the map
		xyz.put(101,"John");
		xyz.put(102,"Scott");
		xyz.put(103,"Mary");
		xyz.put(104,"David");
		xyz.put(105,"Rahul");
		xyz.put(106,"Suresh");
		xyz.put(107,"Pavani");
		xyz.put(108,"Rohit");
		xyz.put(109,"Ram");
		xyz.put(110,"Charvitha");
//2.Fetch the value of a Key using get() method
		System.out.println("The name of the student with ID no:106 :" +xyz.get(106));
		
//3.Create a clone/copy of HashMap
		System.out.println("Copy of Haspmap");
		System.out.print(xyz.clone());;
		
//4.Check if the given Key is in the Map
		System.out.println("Checking whether the key is present in xyz Hashmap: "+xyz.containsKey(103));
		
//5.Check if the value is in the Map
		System.out.println("Checking whether the value is present in the hashmap :"+xyz.containsValue("Yashaswi"));
		
//6.Check if the map is empty
		System.out.println("Checking whether the map is empty :"+xyz.isEmpty());
		
//7.Print the size of the Map to the console
		System.out.println("Size of xyz Haspmap is :"  +xyz.size());
		
//8.Print all the Keys of the map to the console
		System.out.println("Printing all the keys from the Hashmap"+xyz.keySet());
		
//9.Remove a specific Key-value pair
		xyz.remove(103, "Mary");
		
System.out.println("After removing key value pair :"+xyz);

//10. Copying all the elements of the Map to another Map using puttAll() method
System.out.println("\nCopied all the elements of the xyz to icfai :");

java.util.HashMap<Integer, String> icfai = new java.util.HashMap<>();

icfai.putAll(xyz);
System.out.println("icfai = " + icfai);
		
		
		
	}

}
