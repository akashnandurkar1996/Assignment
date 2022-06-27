package com.java8.level2;

import java.util.Scanner;

public class Permutations_14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string ");
		String str = sc.next(); 

		int length = str.length();
		Permutations_14 perm = new Permutations_14();
		perm.permute(str, 0, length -  1);

	}

	void permute(String str, int l, int r) {

		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);

			}

		}

	}

	public String swap(String s, int i, int j) {
        
		char temp;
		char[] charArray = s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return String.valueOf(charArray);

	}

}
