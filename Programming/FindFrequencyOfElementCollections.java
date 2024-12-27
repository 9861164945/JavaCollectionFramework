package com.Collectionframework.Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFrequencyOfElementCollections 
{
	 public static void main(String[] args) 
	 {
		 List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,7,8,1,1,2,3,5,4);
		
		 
		 System.out.println(l1);
		 System.out.println("Find the Frequency Of the given Element="+ Collections.frequency(l1, 1));
		 
		
	}

}
