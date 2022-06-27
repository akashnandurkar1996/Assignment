package com.java8.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	int eid;
	String ename;
	double esalary;
	
	public Employee(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	
	
}

public class EmployeeMap_10 {
	public static void main(String[] args) {
	
		
		List<Employee> emplist= new ArrayList<>();
		
		emplist.add(new Employee(1,"akash",25000));
		emplist.add(new Employee(2,"prakash",30000));
		emplist.add(new Employee(3,"vivek",20000));
		emplist.add(new Employee(4,"anand",35000));
		emplist.add(new Employee(5,"Pankaj",40000));
		emplist.add(new Employee(6,"rohit",50000));
		emplist.add(new Employee(7,"vinay",23000));
		emplist.add(new Employee(8,"rahul",27000));
		emplist.add(new Employee(9,"ravi",33000));
		emplist.add(new Employee(10,"soham",40000)); 
		
		
		//emplist converted to Map
		Map<Integer, String> empMap= emplist.stream().collect(Collectors.toMap(Employee::getEid,Employee::getEname));
		System.out.println(empMap);
		 
		//emplist converted to set
		Set<Employee> empSet= emplist.stream().collect(Collectors.toSet());
		for(Employee e: empSet) {
			System.out.println(e.eid +" "+ e.ename+ " "+ e.esalary+ " ");
			
		}
		
	}
		

}
