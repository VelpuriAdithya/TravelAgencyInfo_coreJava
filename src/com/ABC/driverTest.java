package com.ABC;

import java.util.ArrayList;
import java.util.List;

public class driverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver driver1=new Driver("Auto",1,"Adithya",12222.5);
		Driver driver2=new Driver("Bike",2,"Bhaskar",28722.5);
		Driver driver3=new Driver("car",3,"Kavya",22672.5);
		Driver driver4=new Driver("Auto",4,"Anju",21222.5);
		Driver driver5=new Driver("Bike",5,"Bharath",22322.5);
		Driver driver6=new Driver("car",6,"Kaveri",26522.5);
		Driver driver7=new Driver("Auto",7,"Adisankar",23422.5);
		Driver driver8=new Driver("Bike",8,"Bhavani",29822.5);
		Driver driver9=new Driver("car",9,"Karthik",28722.5);
		Driver driver10=new Driver("Auto",10,"Arun",22782.5);
		Driver driver11=new Driver("Bike",11,"Bhanu",24522.5);
		Driver driver12=new Driver("car",12,"Kushal",22122.5);
		Travel Travel1=new Travel();
		System.out.println(Travel1.isCarDriver(driver1));
		List<Driver> drivers=new ArrayList<>();
		drivers.add(driver1);
		drivers.add(driver2);
		drivers.add(driver3);
		drivers.add(driver4);
		drivers.add(driver5);
		drivers.add(driver6);
		drivers.add(driver7);
		drivers.add(driver8);
		drivers.add(driver9);
		drivers.add(driver10);
		drivers.add(driver11);
		drivers.add(driver12);
		String DriverDetails=Travel1.retriveByDriverId(drivers,8);
		System.out.println(DriverDetails);
		int CountOfCategory=Travel1.retriveCountOfDriver(drivers,"car");
		System.out.println(CountOfCategory);
		List<Driver> List=Travel1.retriveDriver(drivers,"Auto");
		System.out.println(List);
		Driver DriverNameOfMaxDistance=Travel1.maximumDistanceTraveledByDriver(drivers);
		System.out.println(DriverNameOfMaxDistance);
		
		
	}
	
}
