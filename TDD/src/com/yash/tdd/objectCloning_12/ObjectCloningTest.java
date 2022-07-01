package com.yash.tdd.objectCloning_12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectCloningTest {
	
	@Test
	void test() throws CloneNotSupportedException {
	ObjectCloning oc1=new ObjectCloning(1, "akash");
	ObjectCloning  oc2=(ObjectCloning) oc1.clone();
	assertTrue(ObjectCloning.cloneCheck(oc1, oc2));
	}
}
