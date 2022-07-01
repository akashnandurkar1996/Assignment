package com.yash.tdd.CheckString_9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CheckStringTest {

	@Test
	void test() {
		assertEquals("This Red car", CheckString.removespecial("This@ Red $car-."));
	}

}
