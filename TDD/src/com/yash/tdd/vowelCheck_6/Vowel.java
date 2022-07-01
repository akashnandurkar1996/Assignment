package com.yash.tdd.vowelCheck_6;

import java.util.HashSet;
import java.util.Set;

public class Vowel {

	public static int checkvowelcount(String str) {
		int vowelcnt = 0;

		Set<Character> charset = new HashSet<>();

		char[] strarray = str.toLowerCase().toCharArray();

		for (char ch : strarray) {
			charset.add(ch);
		}

		for (Character ch : charset) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelcnt++;
			}
		}
		return vowelcnt;
	}

	public static void main(String[] args) {
		System.out.println(Vowel.checkvowelcount("AKASH"));
	}

}
