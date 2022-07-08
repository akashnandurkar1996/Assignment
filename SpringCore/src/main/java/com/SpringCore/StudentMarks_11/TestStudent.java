package com.SpringCore.StudentMarks_11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> studlist = new ArrayList<>();
		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("StudentMarks_11.xml");

		Student stud1 = (Student) ctxobj.getBean("student1");
		Student stud2 = (Student) ctxobj.getBean("student2");
		Student stud3 = (Student) ctxobj.getBean("student3");
		Student stud4 = (Student) ctxobj.getBean("student4");

		studlist.add(stud1);
		studlist.add(stud2);
		studlist.add(stud3);
		studlist.add(stud4);

		for (Student s : studlist) {
			System.out.println(s.toString());
		}

		List<Student> sortstudlist = studlist.stream()
				.sorted((s1, s2) -> Float.compare(s1.resultobj.total_marks, s2.resultobj.total_marks)).toList();

		System.out.println("sorted list of Students as per total marks");

		for (Student s : sortstudlist) {
			System.out.println(s.sname + " " + s.resultobj.total_marks);
		}
	}
}
