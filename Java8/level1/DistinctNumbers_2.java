package com.java8.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DistinctNumbers_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> markslist = new ArrayList<>();
		System.out.println("enter any 5 numbers");

		for (int i = 0; i <= 4; i++) {
			int a = sc.nextInt();
			markslist.add(a);
		}
		
		
		List<Integer> distinct_num= markslist.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct numbers from list :- ");
        for(int num:distinct_num) {
        	System.out.print(num+ " ");
        }
		
	}
}
