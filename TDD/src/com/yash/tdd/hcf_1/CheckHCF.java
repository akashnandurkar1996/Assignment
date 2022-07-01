package com.yash.tdd.hcf_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckHCF {

	
	//successful test
	@Test
	void test() {
		
		assertEquals(125, Hcf.findhcf(125,625));
	}
	

	

}
