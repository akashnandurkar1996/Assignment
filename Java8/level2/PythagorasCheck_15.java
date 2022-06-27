package com.java8.level2;

public class PythagorasCheck_15 {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 5, 12, 13, 5, 9, 3, 4, 5 };
		int cnt = 0;
 
		for (int i = 0; i <= arr.length - 3; i++) {
			int a = arr[i] * arr[i];
			int b = arr[i + 1] * arr[i + 1];
			int c = arr[i + 2] * arr[i + 2]; 
			if (a == b + c || b == a + c || c == a + b) {
				cnt++;
				System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
			}
		}
		System.out.println("In the above array " + cnt + " combinations of numbers satisfies pythagoras template");
	}

}
