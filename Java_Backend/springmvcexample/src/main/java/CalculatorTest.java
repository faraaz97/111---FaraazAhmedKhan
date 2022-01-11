import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import springmvcexample.utility.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator calc = new Calculator();
		assertTrue(calc.add(2, 3)==5);
	}
	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		assertTrue(calc.sub(5, 3)==2);
	}
	@Test
	public void testMul() {
		Calculator calc = new Calculator();
		assertTrue(calc.mul(2, 3)==6);
	}

}
