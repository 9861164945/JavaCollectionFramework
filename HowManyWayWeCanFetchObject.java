package com.Collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class HowManyWayWeCanFetchObject 
{

	public static void main(String[] args) 
	{
		Vector<String>fruits=new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		//By using Enumartion
		System.out.println("1-By using Enumeration:");
		System.out.println("--------------------");
		
		Enumeration<String> e = fruits.elements();
		while(e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
			
		}
		
		System.out.println("-------------------------");
		System.out.println("2-By using Tostring Method:");
		System.out.println("--------------------");
		System.out.println(fruits);
		System.out.println("-------------------------");
		System.out.println("3-By using Ordinary For Loop Method:");
		System.out.println("--------------------");
		for(int i=0;i<fruits.size();i++) 
		{
			System.out.println(fruits.get(i));
			
		}
		 System.out.println("-------------------------");
		 System.out.println("4-By using For Each Loop:");
		 System.out.println("--------------------");
		 for(String s:fruits) 
		 {
			 System.out.println(s);	 
		 }
		 System.out.println("--------------------");
		 System.out.println("5-By using Iterator Interface-:");
		 System.out.println("--------------------");
		 Iterator<String> itr = fruits.iterator();
		 while(itr.hasNext()) 
		 {
			 System.out.println(itr.next()); 
		 }
		 System.out.println("--------------------");
		 System.out.println("6-By using Listiterator  Interface-:");
		 System.out.println("--------------------");
		 
		 ListIterator<String>lite = fruits.listIterator();
		 while(lite.hasNext()) 
		 {
	System.out.println(lite.next());
		 }
		
		 System.out.println("BackWard \n");
		 System.out.println("--------------------");
		 while(lite.hasPrevious()) 
		 {
			 System.out.println(lite.previous());
			 
		 }
		 System.out.println("--------------------");
		 System.out.println("7-By using spliterator Interface-:");
		 System.out.println("--------------------");
		 Spliterator<String> spl = fruits.spliterator();
		 spl.forEachRemaining(fruit->System.out.println(fruit));
		 System.out.println("--------------------");
		 System.out.println("8-By using forEach Method:-");
		 System.out.println("--------------------");
		 fruits.forEach(fruit->System.out.println(fruit));
		 System.out.println("--------------------");
		 System.out.println("9-By using forEach Method:-");
		 System.out.println("--------------------");
		 fruits.forEach(System.out::println);
		 
		 
		 
		 
	}
}
