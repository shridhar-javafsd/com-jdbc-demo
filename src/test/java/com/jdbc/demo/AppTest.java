package com.jdbc.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	public void testMethod() {
		assertEquals(10, 5 + 5);
	}

	@Test
	public void testMethod2() {
		assertNotEquals(11, 5 + 5);
	}
}