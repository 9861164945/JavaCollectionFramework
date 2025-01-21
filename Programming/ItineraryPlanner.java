package com.Collectionframework.Programming;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner 
{
	private List<Designation> dest;

	public ItineraryPlanner() 
	{
		super();
		dest=new ArrayList<Designation>();
	}
	public void addDestination(Designation destu) 
	{
		dest.add(destu);
		
	}
	public List<Designation> getDest() {
		return dest;
	}
	public void setDest(List<Designation> dest) {
		this.dest = dest;
	} 

	public String displayItinerary() {
        StringBuilder itinerary = new StringBuilder();
        for (Designation destination : dest) {
            itinerary.append(destination.toString()).append("\n");
        }
        return itinerary.toString();
    }


}
