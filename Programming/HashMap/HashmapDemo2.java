package com.Collectionframework.Programming.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		HashMap<Integer, String> studentRecords = new HashMap<>();
		

    studentRecords.put(101, "Scott");
    studentRecords.put(102, "Smith");
    studentRecords.put(103, "Martin");
    studentRecords.put(104, "Aryan");

    System.out.println("Student Records: " + studentRecords);//Printing hashmap

    System.out.println("ENter a id:");
    int searchId = sc.nextInt();//searching the value using key
    String studentName = studentRecords.get(searchId);
    
    if (studentName != null)
    {
        System.out.println("Student with ID " + searchId + " is " + studentName);
    } 
    else
    {
        System.out.println("Student with ID " + searchId + " not found.");
    }

    
   
   System.out.println(studentRecords.put(103, "Rahul"));//Temporary adding the value rahul but output comes 103 rahul
    System.out.println("Updated Records: " + studentRecords);
    System.out.println("ENter a id to delete");
    int did=sc.nextInt();
        studentRecords.remove(did);
  System.out.println("Records after removal: " + studentRecords);

    System.out.println("Enter id to check:");
    int idToCheck = sc.nextInt();
    sc.nextLine();
   System.out.println("Does ID " + idToCheck + " exist? " + studentRecords.containsKey(idToCheck));
System.out.println("ENter name to Search:");
//----doubt-----
//    String nameToCheck = sc.nextLine();
// System.out.println("Does name '" + nameToCheck.equalsIgnoreCase(nameToCheck) + "' exist? " + studentRecords.containsValue(nameToCheck));
String nameToCheck = sc.nextLine();
System.out.println("Does name '" + nameToCheck + "' exist? " +  studentRecords .containsValue(nameToCheck));//Smith=smith//false


    
System.out.println("Iterating through records:");
for (HashMap.Entry<Integer, String> entry : studentRecords.entrySet()) 
{
    System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
}

studentRecords.clear();
System.out.println("All records cleared: " + studentRecords);// empty Hashmap{}
 
		
	
	}

}
