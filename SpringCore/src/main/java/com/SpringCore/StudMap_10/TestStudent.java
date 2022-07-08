package com.SpringCore.StudMap_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("StudentMapping_10.xml");
		Student studmap = (Student) ctxobj.getBean("studbean");

		Map<String, Float> map = studmap.getStuddetails();
		System.out.println("original student data:");
		System.out.println(map);

		// sort the list
		List<Map.Entry<String, Float>> sortedlist = map.entrySet().stream()
				.sorted((e1, e2) -> Float.compare(e1.getValue(), e2.getValue())).toList();
		System.out.println("sorted Student data: ");
		System.out.println(sortedlist);

//  Map<String,Float>  sortedMap = map.entrySet().stream().sorted((e1,e2)->Float.compare(e1.getValue(), e2.getValue())).
//		  collect(Collectors.toMap(e1->e1.getKey(), e2->e2.getValue()));
//     System.out.println(sortedMap);

	}

}
