package com.yash.tdd.pythagoras_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PythagorasTest {

	@Test
	void test() {
		assertTrue(Pythagoras.checktriplet(5,12,13));
		
		
	}
	@Test
	void test1() {
		assertTrue(Pythagoras.checktriplet(5,3,4));
		
	}	
	
}
