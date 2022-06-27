package com.java8.level1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ParallelStream_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = Arrays.asList(23, 34, 67, 45, 56, 23);
		System.out.print("enter any number "); 
		int num = sc.nextInt();
		List<Integer> isFound = numbers.parallelStream().filter(n -> n.equals(num)).distinct().toList();
		if (!isFound.isEmpty())
			System.out.print("number is found"+ isFound);

		else
			System.out.print("number not found");
	}

}
