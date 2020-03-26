package com.epam.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tdd_Remove {
	Tdd_project tdd;
	
	@BeforeEach
	void setUp() {
	tdd=new Tdd_project();
	}
	
	@Test
	void test() {
		assertEquals("BCD",tdd.remove("ABCD"));
	}
	
	@Test
	void testA() {
	assertEquals("CD",tdd.remove("AACD"));
	}

	@Test
	void test1() {
	assertEquals("BCD",tdd.remove("BACD"));
	}

	@Test
	void testA1() {
	assertEquals("BBAA",tdd.remove("BBAA"));
	}

	@Test
	void testA2() {
	assertEquals("BAA",tdd.remove("AABAA"));
	}

	@Test
	void test2() {
	assertEquals("",tdd.remove(""));
	}

}





