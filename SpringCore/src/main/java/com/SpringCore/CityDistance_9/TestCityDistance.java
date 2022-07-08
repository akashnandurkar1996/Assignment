package com.SpringCore.CityDistance_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCityDistance {

	public static void main(String[] args) {
		List<CityDistance> cityDistList = new ArrayList<CityDistance>();
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("CityDistance_9.xml");
		
		
		CityDistance ct1 = (CityDistance) ctxobj.getBean("citybean1");
		CityDistance ct2 = (CityDistance) ctxobj.getBean("citybean2");
		CityDistance ct3 = (CityDistance) ctxobj.getBean("citybean3");
		CityDistance ct4 = (CityDistance) ctxobj.getBean("citybean4");

		cityDistList.add(ct1);
		cityDistList.add(ct2);
		cityDistList.add(ct3);
		cityDistList.add(ct4);

		System.out.println("enter from city name");
		String fromCity = sc.next();

		System.out.println("enter to city name");
		String toCity = sc.next();

		List<CityDistance> matchedList = cityDistList.stream().filter(c -> c.getFromcity().equalsIgnoreCase(fromCity))
				.filter(c -> c.getTocity().equalsIgnoreCase(toCity)).toList();

		if (!matchedList.isEmpty()) {
			for (CityDistance cities : matchedList) {
				System.out.print("distance between "+cities.getFromcity() +" & "+cities.getTocity()+" is "+cities.getDistance() + " Km");

			}
		} else
			System.out.println("data not available");
	}
}
