import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		int i = 19;
		if(i>20);
	}
	@Test
	public void test1() {
	
		
		int age = 18;
		
		
			assertTrue(age>17);
		}
	@Test
	public void test2() {
		String str = "Faraaz";
		String str2 = new String("Faraaz");
		String str1= str2;
		
//		assertEquals(str1, str2);
//		assertNull(str);
		assertSame(str1,str2);
	}
	 
	
	}


