package com.Collectionframework.Programming;

import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

/* we can reverse ion two way  one i s first sort the array and then perform a .sort method and. reverse method of collections class
 * Another way create two method one is swap just call it inside reverse method so u can check it out i side the code
 
 * */
public class ReverseElementusingCollection 
{
	public static void main(String[] args) 
	{

		List<Integer>l1=Arrays.asList(1,2,3,4,5);
		System.out.println("Original Array:"+l1);
	
		 // We can also use:
//		Collections.reverse(l1);
//		System.out.println("Using collection Own method "+l1);
	reverse(l1);
	System.out.println("My Own Method "+l1);
		
		
	}
	public static void reverse(List<Integer> list) 
	{
		for(int i=0;i<list.size()/2;i++) 
		{
			swap(list, i, list.size()-1-i);
			
			
		}
		
	}
	public static void swap(List<Integer> list,int x,int y) 
	{
		int temp=list.get(x);
		list.set(x, list.get(y));
		list.set(y, temp);
		
	}
}
