package com.yash.tdd.checkEvenArray_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayEvenTest {
	@Test
	void test() {
		assertEquals(3, ArrayEven.iseven(new int[] { 34, 4, 5, 6, 7 }));
	}
}
