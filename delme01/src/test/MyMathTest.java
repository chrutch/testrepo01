package test;

import static org.junit.Assert.*;

import org.junit.Test;

import mymath.MyMath;

public class MyMathTest {
	@Test
	public void testMulti() {
		MyMath math = new MyMath();
		assertEquals(50, math.multi(5, 10));
	}
}