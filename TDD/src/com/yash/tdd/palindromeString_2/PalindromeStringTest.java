package com.yash.tdd.palindromeString_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class PalindromeStringTest {

	@Test
	void test() {
      assertTrue(PalindromeString.checkPalindrome("RADAR", "RADAR"));
	}
}
