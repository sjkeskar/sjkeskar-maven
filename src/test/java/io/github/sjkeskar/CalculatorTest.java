package io.github.sjkeskar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	Calculator c1 = new Calculator();

	@Test
	public void addTest() {
		assertEquals(30, c1.add(10, 20));
	}

	@Test
	public void subtractTest() {
		assertEquals(30, c1.subtract(40, 10));
	}
}
