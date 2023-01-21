package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

	Calculator calculator = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(-1, calculator.subtract(2, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(2, calculator.divide(6, 3));
	}

}
