package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Test;
public class CalculatorTest {

	@Test
    public void evaluatesExpression() {
       Calculator Calculator = new Calculator();
       int sum = Calculator.evaluate("1+2+3");
       assertEquals(6, sum);
	}
}
