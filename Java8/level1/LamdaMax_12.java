package com.java8.level1;

import java.util.ArrayList;
import java.util.List;

interface MyInterface {
	void m1(int[] arr);
}

public class LamdaMax_12 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		MyInterface mi = (int[] arr) -> {

			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}

			Integer max = list.stream().max((i1, i2) -> i1 > i2 ? 1 : -1).get();

			System.out.println("maximum number in array " + max);

		}; 

		mi.m1(new int[] { 56, 145, 67, 98, 12 });

	}

}
