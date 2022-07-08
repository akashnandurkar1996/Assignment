package com.SpringCore.EmpDept_4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();

		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("EmpDept_4.xml");
		Employee e1 = (Employee) ctxobj.getBean("empbean1");
		Employee e2 = (Employee) ctxobj.getBean("empbean2");
		Employee e3 = (Employee) ctxobj.getBean("empbean3");
		Employee e4 = (Employee) ctxobj.getBean("empbean4");

		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);

		List<Employee> sortedlist = emplist.stream().sorted((s1, s2) -> Double.compare(s1.esalary, s2.esalary))
				.toList();

		System.out.println("sorted list as per the employee salary");
		for (Employee e : sortedlist) {
			System.out.println(e.toString());
		}

	}

}
