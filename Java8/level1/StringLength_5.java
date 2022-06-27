package com.java8.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringLength_5 {
	public static void main(String[] args) {

		String[] str = { "india", "USA", "UAE", "Arjentina", "kanada", "brazil", "England" };

		for (String s : str) { 
			System.out.print(s + ", ");
		}

		List<Integer> strcounts = new LinkedList<Integer>();
 
		for (String s : str) {
			int cnt = 0;
			char[] arr = s.toCharArray();
			for (char ch : arr) {
				cnt++;
			} 
			strcounts.add(cnt);
		}

		Integer max = strcounts.stream().max((s1, s2) -> s1 > s2 ? 1 : -1).get();

		int index = strcounts.indexOf(max);

		System.out.println("\n string having maximum length " + str[index]);

	}

}
