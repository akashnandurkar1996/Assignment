package com.yash.tdd.EmailPassCheck_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailPassTest {

	@Test
	void test() throws Exception {		
		assertTrue(EmailPass.checkdetails("aanandurkar@gmail.com", "akash1996"));
	}
	@Test
	void test1() throws Exception {		
	assertTrue(EmailPass.checkdetails("pankaj@gmail.com", "pankaj1234"));
	}
}
