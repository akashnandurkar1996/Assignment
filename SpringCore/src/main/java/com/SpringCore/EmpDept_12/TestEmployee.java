package com.SpringCore.EmpDept_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) throws Exception {
		List<Employee> emplist = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);

		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("EmpDept_12.xml");
		Employee e1 = (Employee) ctxobj.getBean("empbean1");
		Employee e2 = (Employee) ctxobj.getBean("empbean2");
		Employee e3 = (Employee) ctxobj.getBean("empbean3");
		Employee e4 = (Employee) ctxobj.getBean("empbean4");

		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);

		for (Employee e : emplist) {
			System.out.println(e.toString());
		}

		// b. Print name of employees having highest salary
		Employee maxSalaryEmp = emplist.stream().max((s1, s2) -> s1.esalary > s2.esalary ? 1 : -1).get();
		System.out.println("\n employee having highest salary: \n" + maxSalaryEmp.ename);

		// c. Name of employee having salary less than or equal to average salary.

		double avgSalary = emplist.stream().collect(Collectors.averagingDouble(e -> e.esalary));
		List<Employee> avgsalEmployees = emplist.stream().filter(e -> e.esalary <= avgSalary).toList();
		System.out.println("\n employess having salary less than avg salary");

		for (Employee e : avgsalEmployees) {
			System.out.println(e.toString());
		}

		
		List<String> departmentsList = emplist.stream().map(e -> e.dept.deptname).distinct().toList();

		//a. Find maximum salary in a each department.
		System.out.println("\n max salaries in each department");
		for (String d : departmentsList) {
			Employee maxSalaryDept = emplist.stream().filter(e -> e.dept.deptname.equals(d))
					.max((s1, s2) -> s1.esalary > s2.esalary ? 1 : -1).get();

			System.out.println("max salary of " + d + " department is: " + maxSalaryDept.esalary);
		}

		
		// d. Average salary of each department
		System.out.println("\n avg salaries of each department");
		for (String d : departmentsList) {
			double avgsalary = emplist.stream().filter(e -> e.dept.deptname.equals(d))
					.collect(Collectors.averagingDouble(e -> e.esalary));
			System.out.println("average salary of " + d + " department is: " + avgsalary);
		}

	}

}
