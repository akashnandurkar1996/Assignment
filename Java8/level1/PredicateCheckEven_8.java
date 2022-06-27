package com.java8.level1;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateCheckEven_8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt(); 
		
		Predicate<Integer> isEvenNum= num -> (num%2==0);
		 
		if(isEvenNum.test(number))
			System.out.println(number+ " is even number");
		else
		System.out.println(number+ " is odd number");
	}

}
