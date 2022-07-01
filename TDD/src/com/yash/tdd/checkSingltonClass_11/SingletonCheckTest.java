package com.yash.tdd.checkSingltonClass_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonCheckTest {
	@Test
	void test() {
		Singleton st1=Singleton.getSingleton();
		Singleton st2=Singleton.getSingleton();
	assertTrue(SingletonCheck.checksingleton(st1, st2));
	}
}


