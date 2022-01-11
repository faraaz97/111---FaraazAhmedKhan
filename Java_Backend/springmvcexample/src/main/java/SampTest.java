import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampTest {
	
	int age=0;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Inside the before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Inside the after class");
	}

	@Before
	public void setUp() throws Exception {
		age=18;
		System.out.println("Inside before annotation");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Inside After annotion");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		if(age>=18);
		{
			System.out.println("Have rights to vote");
		}
		
		}
	@Test
	public void test1() {
	
		{
			System.out.println("Donot have rights to vote");
		assertFalse(false);
	}

}
}
