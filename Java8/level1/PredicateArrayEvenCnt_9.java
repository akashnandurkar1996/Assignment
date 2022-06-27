package com.java8.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateArrayEvenCnt_9 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(45, 36, 45, 67, 88, 98, 98, 56);

		Predicate<Integer> checkeven = num -> num % 2 == 0;

		List<Integer> evencnt = list.stream().filter(i -> checkeven.test(i)).toList();

		List<Integer> oddcnt = list.stream().filter(i -> !checkeven.test(i)).toList();

		System.out.println("total even numbers in list: " + evencnt.size());
		System.out.println(evencnt);
		System.out.println("\n total odd numbers in list:  " + oddcnt.size());
		System.out.println(oddcnt);
		
	}

}
