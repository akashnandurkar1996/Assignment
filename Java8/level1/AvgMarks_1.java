package com.java8.level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AvgMarks_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> markslist = new ArrayList<>();
		System.out.println("enter any 5 numbers");

		for (int i = 0; i <= 4; i++) {
			int a = sc.nextInt();
			markslist.add(a);
		} 

		double avg = markslist.stream().collect(Collectors.averagingDouble(e -> e));
		System.out.println("avg of marks is " +avg);


		
	}

}
