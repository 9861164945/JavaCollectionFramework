package com.Collectionframework.Programming;
import java.util.ArrayList;
import java.util.List;

public class Designation 
{
	private String name;
	private List<Activity>activities;
	public Designation(String name) {
	
		this.name = name;
		this.activities =new ArrayList<Activity>();
	}
	public String getName() {
		return name;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	
	public void addActivity(Activity act) {
		activities.add(act);
	}
	@Override
    public String toString() {
        StringBuilder result = new StringBuilder("Destination: " + name + "\n");
        for (Activity act : activities) {
            result.append(act.toString()).append("\n");
        }
        return result.toString();
    }


}
