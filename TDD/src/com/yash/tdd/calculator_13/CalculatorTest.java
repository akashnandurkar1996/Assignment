package com.yash.tdd.calculator_13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testsum(){
	assertEquals(-1, Calculator.sum(12, -13));
	}
	
	
	@Test
	void testsub(){
	assertEquals(-1, Calculator.sub(12,13));
	}
	
	@Test
	void testmul(){
	assertEquals(-0, Calculator.mul(0,13));
	assertEquals(+0, Calculator.mul(13,0));
	
	}

	
	@Test
	void testdiv() throws Exception{
	assertEquals(-0, Calculator.div(0,1));
	}
	
	@Test
	void testmod() throws Exception{
	assertEquals(0, Calculator.mod(12,1));
	}
	
	@Test
	void testpow() throws Exception{
	assertEquals(1, Calculator.power(1,0));
	}
	
	@Test
	void testsqrt() throws Exception{
	assertEquals(12, Calculator.squareroot(144));
	}
	
	
	@Test
	void testqbrt() throws Exception{
	assertEquals(5, Calculator.quberoot(125));
	}
		

}
