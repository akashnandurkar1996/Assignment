package com.SpringCore.EmiCalculation_3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmiCalculation {
	public static void main(String[] args) {

		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("EmiCalculation_3.xml");

		EmiCalculation ECobj = (EmiCalculation) ctxobj.getBean("ratebean");
		System.out.println("interest rate is " + ECobj.interest_Rate + "%");
		calculateEmi(ECobj.interest_Rate);

	}

	public static void calculateEmi(float rate) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter amount");
		float amount = sc.nextFloat();

		System.out.println("enter loan tenure in years");
		int tenure = sc.nextInt();
		int tenureInMonts = tenure * 12;

		float totalPayAmount = amount + ((amount * rate) / 100) * tenure;
		System.out.println("total payable amount is Rs. " + totalPayAmount);

		float emi = totalPayAmount / tenureInMonts;
		System.out.println("emi per month for " + amount + " for " + tenure + " years will be " + emi);
	}

}
