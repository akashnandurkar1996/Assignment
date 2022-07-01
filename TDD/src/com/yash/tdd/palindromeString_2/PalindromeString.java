package com.yash.tdd.palindromeString_2;

public class PalindromeString {

	public static boolean checkPalindrome(String str1, String str2) {
		char[] arr = str1.toCharArray();
		int len = arr.length;
		char[] revarray = new char[len];
		String revstring;

		for (int i = len - 1, j = 0; i >= 0; i--, j++) {
			revarray[j] = arr[i];
		}

		revstring = String.valueOf(revarray);

		if (str2.equals(revstring) && str1.equals(revstring)) {
			return true;
		} else

			return false;

	}

	public static void main(String[] args) {
		System.out.println(PalindromeString.checkPalindrome("MOM", "MOM"));
	}

}
