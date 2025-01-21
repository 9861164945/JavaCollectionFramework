package com.Collectionframework.Programming.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> map=new  HashMap<>();
		map.put(1, "oppo");
		map.put(2, "mi");
		map.put(2, "Samsung");
		map.put(3, "realme");
		map.put(4, "vivo");
		System.out.println("HashMap :"+map);
	
		String val=map.get(2);//We can get the value by key
		System.out.println("Value for Key 2 is:"+val);
		String vale=map.getOrDefault(5, "apple");//it add the key value if not there but this addition is not permanent it is a temporary 
		
 System.out.println("Value for key 5 is:"+vale);		
	
 
		boolean hasKey=map.containsKey(3);
		System.out.println("Is hashmap Contains key 3:"+hasKey);
		boolean hasVal=map.containsValue("oppo");
		System.out.println("Is hashmap conation value oppo:"+hasVal);
		map.remove(5);//not exit
		map.remove(1);
		System.out.println("After removing:"+map);
		System.out.println("Iterating through hashmap:");
		for(HashMap.Entry<Integer,String>entry:map.entrySet()) 
		{
			System.out.println("{Key:"+entry.getKey()+" ,Value :"+entry.getValue()+"}");
			
		}
		System.out.println("=----------Iterating through iterator-----");
		
			Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();	
			itr.forEachRemaining(System.out::println);
			
			System.out.println("--------Iterating through forEach(BiConsumer<T,U>)-----");
		      map.forEach((k,v)-> System.out.println("Key is :"+k+" Value is :"+v));
		
		      int size = map.size();
		        System.out.println("Size of HashMap: " + size);//3
		       
		        map.clear();
		        System.out.println("HashMap after clearing: " + map); //{}
	}

}
