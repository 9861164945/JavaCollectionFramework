package com.Collectionframework.Programming;

import java.util.ArrayList;

public class CabCustomerService 
{
	private ArrayList<CabCustomer> customers;	
//constructor
public CabCustomerService()
{
customers=new ArrayList<CabCustomer>();
}
	
//Adding CabCustomer to my ArrayList
public void addCabCustomer(CabCustomer cust) 
{
	customers.add(cust);
	
}
//Check customer 

public  boolean isFirstCustomer(CabCustomer cust) 
{
	for(CabCustomer isACustomer: customers)
	{
		if(isACustomer.getPhoneNumber()==cust.getPhoneNumber()) 
		{
			return false;
			
		}
	}
	return true;

	
}
//Calculate bill
public double calculateBill(CabCustomer cust) 
{
	if(isFirstCustomer(cust)) 
	{
		return 0.0;
		
	}
	else {
		int distance=cust.getDistance();
		if(distance<=4) {
			return 80.0;
		}
		else {
			return 80.0*(distance-4)*6.0;
		}
	}
	
}
//print  Bill
public void printBill(CabCustomer cust) 
{
	double bill=calculateBill(cust);
	System.out.println(cust.getCustomerName());
	System.out.println(cust.getCustomerName()+" please pay your bill of Rs."+ bill);
	
}


}
