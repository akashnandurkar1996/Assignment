package com.SpringCore.AvgNumbers_2;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNumbers {

	public static void main(String[] args) {
		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("AvgNumbers_2.xml");
		Numbers num = (Numbers) ctxobj.getBean("numbean");
		
		
		List<Integer> numlist= num.numberlist;
		
		
	}

}
