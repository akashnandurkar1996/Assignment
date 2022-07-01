package com.yash.tdd.calculator_13;

public class Calculator {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int i, int j) {
		return i * j;
	}

	public static float div(int i, int j) throws Exception {
		float div = 0;
		if (j == 0) {
			throw new Exception("can not divisible by zero");
		} else {
			div = i / j;
		}
		return div;
	}

	public static int mod(int i, int j) throws Exception {
		int rem = 0;
		if (j == 0) {
			throw new Exception("can not divisible by zero");
		} else {
			rem = i % j;
		}
		return rem;
	}

	public static long power(int num, int index) throws Exception {
		long power = 1;
		if (index < 0) {
			throw new Exception("index can not be less than zero");

		} else {
			for (int i = 0; i < index; i++) {
				power = power * num;
			}
		}
		return power;
	}

	public static double squareroot(double num) throws Exception {
		double sqrt = 1;
		if (num < 0) {
			throw new Exception("number can not less than 0");
		}
		else {
			sqrt = Math.sqrt(num);
		}
		return sqrt;
	}

	public static double quberoot(double num) throws Exception {
		double qbrt = 1;
		if (num < 0) {
			throw new Exception("number can not less than 0");
		} else {
			qbrt = Math.cbrt(num);
		}
		return qbrt;
	}
	

	
}
