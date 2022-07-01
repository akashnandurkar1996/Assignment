package com.yash.tdd.PalindromeNumber_7;

public class PalindromeNumber {

	public static boolean checkpalidrome(int a) {
		int rem, sum = 0 ,temp=a;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum * 10 + rem;
			temp= temp / 10;
		}
		
		if (sum == a) {
			return true;
		} else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(PalindromeNumber.checkpalidrome(141));
	}
}
