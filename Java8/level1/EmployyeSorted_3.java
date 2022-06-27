package com.java8.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployyeSorted_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	List<String> markslist = new ArrayList<>();
	System.out.println("enter any 5 employee names");

	for (int i = 0; i <= 4; i++) {
		String a = sc.next(); 
		markslist.add(a);
	}
	
	
	List<String> distinct_num= markslist.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println("distinct numbers from list :- ");
    for(String num:distinct_num) {
    	System.out.print(num+ " ");
    }
}
} 
