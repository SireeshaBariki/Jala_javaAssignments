package Strings;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s1="welcome";
String s2=" to java";
System.out.println(s1.concat(s2)); */
		
//Length of the string
	/*	String s1="welcome";
		String s2=" to java";
		String s3=s1.concat(s2);
		System.out.println(s3.length()); */
		
//Extracting a string using substring
	/*	String s1="welcome to java";
		System.out.println(s1.substring(0,7)); */
		
/* 5. Searching in strings using indexOf()
        String si = "Searching index";
        //The indexOf() method returns the position of first occurrence of character
        int i1 = si.indexOf("index");
        //first occurrence of the letter "e", start from index 3
        int i2 = si.indexOf("h", 3);
        System.out.println("At Index : " + i1);
        System.out.println("At Index : " + i2);		*/
/* 6. Matching a String Against a Regular Expression With matches()
        String ms = "Matching a String";
        // Testing if regex is present or not
        boolean match = ms.matches("(.*)String(.*)");
        //Boolean value, returns true if matches else false
        System.out.println("Matches : " + match); */
/* Comparing strings using the methods equals()
        String s1="welcome";
        String s2="Welcome";
        System.out.println(s1.equals(s2)); //false*/ 
/*equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
        String s1="welcome";
        String s2="Welcome";
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s1.startsWith("w"));//true
        System.out.println(s1.startsWith("wel")); //true
        System.out.println(s1.startsWith("elc"));//false
        System.out.println(s1.startsWith("W"));//false
        System.out.println(s1.endsWith("e"));//true
        System.out.println(s1.endsWith("we"));//false
        System.out.println(s1.compareTo(s2)); */
 /*Trimming strings with trim()       
		String s1="    welcome    ";
        System.out.println(s1);
        System.out.println(s1.trim()); */
/*Replacing characters in strings with replace()
		String s1="welcome";
        String s2="Welcome to java";
        System.out.println(s1.replace('e', 'a'));
        System.out.println(s2.replace("java","Selenium")); */
/*	Splitting strings with split()
		String s1="abc@gmail.com";
		String a[]=s1.split("@");
		for(String i:a)
		{
			System.out.println(i);
		}                                 */
/*Converting Numbers to Strings with valueOf()
		int value=30;  
		String s1=String.valueOf(value);  
		System.out.println(s1);
		System.out.println(s1+10);//concatenating string with 10    */
		
//	Converting to uppercase and lowercas
		String s1="welcome";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		 
      
	}   

}
