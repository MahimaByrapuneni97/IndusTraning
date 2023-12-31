package com.indus.training.basics;

import junit.framework.TestCase;

public class TestCalcTest extends TestCase {
	Calc calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calc();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdditionSer1() {
		// Input
		double par1 = 100.0;
		double par2 = 200.0;
		// expected output
		double expectedoutput = 300.0;
		// Actual output
		double actualoutput = calObj.addtion(par1, par2);
		// assert
		assertEquals(expectedoutput, actualoutput, 0);
	}

	public void testAdditionSer2() {
		// Input
		double par1 = 10.0;
		double par2 = 20.0;
		// expected output
		double expectedoutput = 30.0;
		// Actual output
		double actualoutput = calObj.addtion(par1, par2);
		// assert
		assertEquals(expectedoutput, actualoutput);

	}
}
