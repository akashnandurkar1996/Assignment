package com.SpringCore.ItemName_8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItem {
public static void main(String[] args) {
	ApplicationContext ctxobj= new ClassPathXmlApplicationContext("ItemName_8.xml");
	
	Item itemobj= (Item) ctxobj.getBean("itembean");
	List<String> itemlist= itemobj.items;
	System.out.println(itemlist);
	
	System.out.println("List in ascending order: ");
	List<String> ascendingList= itemlist.stream().sorted().distinct().toList();
    System.out.println(ascendingList);
    
    System.out.println("List in descending order: ");
    List<String> descendingList= ascendingList.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println(descendingList);
}
}
