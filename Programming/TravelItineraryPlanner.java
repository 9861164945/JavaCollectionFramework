package com.Collectionframework.Programming;
public class TravelItineraryPlanner {

	public static void main(String[] args) 
	{
		ItineraryPlanner itineraryPlanner = new ItineraryPlanner();

        // Create destination objects
        Designation paris = new Designation("Paris");
        Designation london = new Designation("London"); 

        // Create activity objects for Paris
        Activity eiffelTower = new Activity("wiffelTower", "Night");
        Activity louvreMuseum = new Activity("louvreMuseum", "evening");
        // Create activity objects for London
        Activity britishMuseum = new Activity("British Museum", "Morning");
        Activity londonEye = new Activity("London Eye", "Afternoon");
 
        // Add activities to destinations
        paris.addActivity(eiffelTower);
        paris.addActivity(louvreMuseum);

        london.addActivity(britishMuseum);
        london.addActivity(londonEye);

        // Add destinations to itinerary planner
        itineraryPlanner.addDestination(paris);
        itineraryPlanner.addDestination(london);

        // Display the itinerary
        System.out.println(itineraryPlanner.displayItinerary());

		
		 
	}

}
