package com.Collectionframework.Programming;


import java.util.*;

public class FindingUniqueElementsInString
{

public static void main(String[] args)
{
	Set<Character> unique=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a name by  that name i can check how many Unique elemnts are theree");
	String s=sc.next();
	for(char ch:s.toCharArray()) 
	{
		unique.add(ch);
		
	}
	System.out.println("  :"+ unique.size() +" :  ");
	
}
	

}
