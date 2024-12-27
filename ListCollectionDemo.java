package com.Collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListCollectionDemo 
{
	public static void main(String[] args) 
	{ 
		List<Integer>l=new ArrayList<Integer>()	;
		l.add(90);
		l.add(89);
		l.add(789);
		l.add(89);
		l.add(789);
		l.add(89);
		l.add(789);
		
		System.out.println(l);
		
		l.clear();
		
		
		System.out.println(l);
		
		Set<Integer>set=new HashSet<>();
		set.add(90);
		set.add(68);
		set.add(68);
		set.add(68);
		
		
		System.out.println(set);
	 Map<Integer, String>se=new HashMap<>();
	se.put(1, "Sonu");
	se.put(2, "Sambit");
	se.put(3, "Sambit");
	
	System.out.println(se);
	}

}
