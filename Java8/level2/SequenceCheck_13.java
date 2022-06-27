package com.java8.level2;

public class SequenceCheck_13 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 17, 18, 19, 20 };
		System.out.print(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if (i <= arr.length - 2) { 
				if (arr[i + 1] - arr[i] > 1) {
					System.out.print("-");
					System.out.print(arr[i]);
					System.out.print(",");
					System.out.print(arr[i + 1]);
				}
			} 
			else {
				System.out.print("-");
				System.out.print(arr[arr.length - 1]);
			}
		}
	}
}
