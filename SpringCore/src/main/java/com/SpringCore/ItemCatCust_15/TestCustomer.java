package com.SpringCore.ItemCatCust_15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
public static void main(String[] args) {
	ApplicationContext ctxobj= new ClassPathXmlApplicationContext("ItemCatCust_15.xml");
	Customer cust1=(Customer) ctxobj.getBean("custbean");
	System.out.println(cust1.toString());
	
}
}
