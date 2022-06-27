package com.java8.level3;

import java.awt.image.BandedSampleModel;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee {

	String ename;
	LocalDate dob;
	LocalDate doj;
	LocalDate dor;
	String worklocation;
	String department;
	double salary;

	public Employee(String ename, LocalDate dob, LocalDate doj, LocalDate dor, String worklocation, String department,
			double salary) {
		super();
		this.ename = ename;
		this.dob = dob;
		this.doj = doj;
		this.dor = dor;
		this.worklocation = worklocation;
		this.department = department;
		this.salary = salary;
	}

}

public class EmployeeManagement_17 {
	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee("Akash", LocalDate.of(1996, 9, 30), LocalDate.of(2021, 9, 10), null, "pune",
				"development", 30000));
		emplist.add(new Employee("Rahul", LocalDate.of(1998, 8, 13), LocalDate.of(2022, 6, 25), null, "pune",
				"marketing", 15000));
		emplist.add(new Employee("Vivek", LocalDate.of(1997, 6, 20), LocalDate.of(2022, 7, 15), null, "pune", "UI/UX",
				20000));
		emplist.add(new Employee("Anand", LocalDate.of(1999, 9, 1), LocalDate.of(2021, 8, 10), null, "pune", "UI/UX",
				40000));
		emplist.add(new Employee("Pankaj", LocalDate.of(1996, 11, 9), LocalDate.of(2020, 3, 30), null, "pune",
				"development", 80000));
		emplist.add(new Employee("Ashish", LocalDate.of(1996, 11, 9), LocalDate.of(2020, 3, 30), null, "pune",
				"development", 90000));

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("____________________________________________________");
			System.out.println("1.employee in a particular department.");
			System.out.println("2.Average salary of each department");
			System.out.println("3.Highest and lowest salary of each department");
			System.out.println("4.Department with highest no of employee and lowest no of employee");
			System.out.println("5.Total number of years of experience of each employee");
			System.out.println("6.Upcoming birthday");
			System.out.println("7.Upcoming birthday");
			System.out.println("____________________________________________________");
			System.out.println("Select option from above list");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				// employee in a particular department.
				System.out.println("enter department");
				String dept = sc.next();
				List<Employee> deptlist = emplist.stream().filter(e -> e.department.equals(dept)).toList();

				if (!deptlist.isEmpty()) {
					for (Employee emp : deptlist) {
						System.out.println("name:" + emp.ename + " DOB:" + emp.dob + " DOJ:" + emp.doj + " DOR:"
								+ emp.dor + " location:" + emp.worklocation + " department:" + emp.department
								+ " Salary:" + emp.salary);
					}

				} else {
					System.out.println("department not exist");
				}

				break;
			}

			case 2: {
				// avg salary for each department

				List<String> departments = emplist.stream().map(d -> d.department).distinct().toList();

				for (String dept : departments) {
					Double avgsalary = emplist.stream().filter(e -> e.department.equals(dept))
							.collect(Collectors.averagingDouble(e -> e.salary));
					System.out.println("department:" + dept + " avg salary" + avgsalary);
				}

				break;
			}

			case 3: {
				// highest & lowest salary in each department

				List<String> departments = emplist.stream().map(d -> d.department).distinct().toList();
				for (String dept : departments) {
					double maxSalary = emplist.stream().filter(e -> e.department.equals(dept)).map(e -> e.salary)
							.max((e1, e2) -> e1 > e2 ? 1 : -1).get();
					double minSalary = emplist.stream().filter(e -> e.department.equals(dept)).map(e -> e.salary)
							.min((e1, e2) -> e1 > e2 ? 1 : -1).get();
					System.out.println("department:" + dept + " maxsalary:" + maxSalary + " minsalary:" + minSalary);
				}
				break;
			}

			case 4: {
				// Department with highest no of employee and lowest no of employee.


				break;
			}
			case 5: {
			    //	Total number of years of experience of each employee. 
				List<String> employees = emplist.stream().map(d -> d.ename).toList();
				System.out.println(employees);
				
				for (String emp : employees) {
			    boolean  listemp=emplist.contains(emp);
			     	
				}

				break;
			}

			case 6: {

				break;
			}

			case 7: {

				break;
			}

			default:
				System.out.println("wrong choice");
			}

		}

	}

}
