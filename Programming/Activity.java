package com.Collectionframework.Programming;

public class Activity
{
	   private String name;
	    private String schedule;

	    public Activity(String name, String schedule) {
	        this.name = name;
	        this.schedule = schedule;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getSchedule() {
	        return schedule;
	    }

	    @Override
	    public String toString() {
	        return "- " + name + " (" + schedule + ")";
	    }



}
