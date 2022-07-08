package com.SpringCore.Shape_14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShape {
	public static void main(String[] args) {

		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("Shape_14.xml");

		Circle circleobj = (Circle) ctxobj.getBean("circlebean");
		Square Squareobj = (Square) ctxobj.getBean("squarebean");
		Rectangle rectangleobj = (Rectangle) ctxobj.getBean("rectanglebean");

		System.out.println("1.Circle Details \n 2.Square Details \n 3. Rectangle Details \n Enter choice");
		Scanner sc = new Scanner(System.in);
		int a = 5;
		int b = 5;
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			circleobj.area(a, b);
			circleobj.side();
			break;
		case 2:
			Squareobj.area(a, b);
			Squareobj.side();
			break;
		case 3:
			rectangleobj.area(a, b);
			rectangleobj.side();
			break;

		default:
			System.out.println("wrong input");
			break;
		}

	}

}
