package com.yash.tdd.checkArrayStrings_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayStringsTest {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon", ArrayStrings.checkArrayString(new String[] {"apple","orange","banana","lemon"} ));
		
	}

}
