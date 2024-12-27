package com.Collectionframework.Programming;

import java.util.Arrays;
import java.util.List;

public class SwapTwoElementsUsingCollection 
{
	public static void main(String[] args) 
	{
		List<Integer>l1=Arrays.asList(1,2,3,4,5,6,6,7,8,9,0);
		System.out.println("Original List:"+l1);
		swap(l1, 1, 10);
		System.out.println("After Swapping:"+l1);
		
		
	}
	public static void swap(List<Integer> list,int x,int y) 
	{
		int temp=list.get(x);
		list.set(x, list.get(y));
		list.set(y, temp);
		
	}

}
