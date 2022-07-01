package com.yash.tdd.Itemcheck_15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ItemCheckTest {

	@Test
	void test() throws Exception {
		   Item i=new Item(111, "akash", 1500, 1900, LocalDate.of(2021, 9, 21), LocalDate.of(2022,10, 10));
		assertTrue(ItemCheck.createObject(i));
	}
}
