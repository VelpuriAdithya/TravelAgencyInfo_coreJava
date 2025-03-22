package com.ABC;

import java.util.ArrayList;
import java.util.List;

public class Travel {

	public boolean isCarDriver(Driver driver) 
	{
		return driver.getCategory().equalsIgnoreCase("car");
		
	}
	public String retriveByDriverId(List<Driver>drivers,int driverId)
	{
		for(Driver D:drivers)
		{
			if(D.getDriverId()==driverId)
			{
				return "Driver name is "+D.getDriverName()+" Belonging to the category "+D.getCategory()+" Traveled "+D.getTotalDistance()+"KM so far.";
			}
						
		}
		return "No Driver Id Matched";
	}
	public int retriveCountOfDriver(List<Driver>drivers,String Category)
	{
		int count=0;
		for(Driver D:drivers)
		{
			if(D.getCategory().equalsIgnoreCase(Category))
				count++;
		}
		return count;
		
	}
	public List<Driver> retriveDriver(List<Driver> drivers,String category)
	{
		List<Driver> Driverlist=new ArrayList<>();
		
		for(Driver D:drivers)
		{
			if(D.getCategory().equalsIgnoreCase(category))
			{
				Driverlist.add(D);
			}
		}
		return Driverlist; 
	}
	public Driver maximumDistanceTraveledByDriver(List<Driver>drivers)
	{
		Double Max=0.0;
		Driver d1=new Driver();
		for(Driver D:drivers)
		{
			if(D.getTotalDistance()>Max)
			{
				Max=D.getTotalDistance();
				d1=D;
			}
			
		}
		return d1;
	}
}
