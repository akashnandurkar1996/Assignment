package com.yash.tdd.vowelCheck_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VowelTest {

	@Test
	void test() {
		assertEquals(2, Vowel.checkvowelcount("INDIA"));
	}

	@Test
	void test1() {
		assertEquals(1, Vowel.checkvowelcount("AKASH"));
	}
}
