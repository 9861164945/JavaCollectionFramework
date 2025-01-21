package com.Collectionframework.Programming;

public class CabCustomer 
{
private int custId;
private String customerName;
private String pickupLocation;
private String dropLocation;
private int distance;
private long phoneNumber;
//No argument Constructor

public CabCustomer() 
{

	this.custId=0;
	this.customerName="";
	this.pickupLocation="";
	this.dropLocation="";
	this.distance=0;
	this.phoneNumber=0L;
	
}
//Parameterized Constructor
public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,long phoneNumber)
{
	super();
	this.custId = custId;
	this.customerName = customerName;
	this.pickupLocation = pickupLocation;
	this.dropLocation = dropLocation;
	this.distance = distance;
	this.phoneNumber = phoneNumber;
}

//Getter Setter
public int getCustId() {
	return custId;
}
public String getCustomerName() {
	return customerName;
}
public String getPickupLocation() {
	return pickupLocation;
}
public String getDropLocation() {
	return dropLocation;
}
public int getDistance() {
	return distance;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public void setPickupLocation(String pickupLocation) {
	this.pickupLocation = pickupLocation;
}
public void setDropLocation(String dropLocation) {
	this.dropLocation = dropLocation;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString()
{
	return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
    + ", dropLocation=" + dropLocation + ", distance=" + distance + ", phoneNumber=" + phoneNumber + "]";
}



}

