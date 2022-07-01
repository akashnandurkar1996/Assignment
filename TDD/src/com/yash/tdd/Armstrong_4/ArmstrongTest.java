package com.yash.tdd.Armstrong_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void test() {
		assertEquals(153, Armstrong.checkarmstrong(153));
	}

}
