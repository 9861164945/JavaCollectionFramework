package com.Collectionframework.Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStringAscending 
{
	public static void main(String[] args) 
	{
		
		List<String>s= new ArrayList<String>();
		
		s.add("bird");
		s.add("eagle");
		s.add("rabbit");
		s.add("zebra");
		s.add("apple");
		s.add("aim");
		s.add("aeiou");
		System.out.println(s);//Printing the list By default toString()
		sortUsinfCollectionIMethod(s);
System.out.println(s);	//After Sorting

sortUsingComparator(s);
System.out.println(s);
sortLam(s);
System.out.println(s);
		
		
	}

	
	public static void sortUsinfCollectionIMethod(List<String>str) 
	{
		Collections.sort(str);//this method convert my String list in ascending order
		Collections.reverse(str);//After Calling this method My String SOrt in descending order
		
		
	}
	//By using Comparator
	public static void sortUsingComparator(List<String> s) 
	{
	    Collections.sort(s, new Comparator<String>() 
	    {
	        public int compare(String s1, String s2)
	        {
	            if (s1.equals(s2)) 
	            {
	                return 0;
	            } else if (s1.charAt(0) < s2.charAt(0)) //Ascending 
	            	//If you want descending then in this condituin return -1 then your String list will be converted to Descending;
	            {
	                return -1;
	            }
	            else
	            {
	                return 1;
	            }
	        }
	    });
	}
	//By using Lambda Expression
	public static void sortLam(List<String>st) 
	{
		
		Collections.sort(st,(s1,t1)->0);
	}
	

	
}
