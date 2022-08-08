package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {

	//1. assertEquals
	/*@Test
	public void test() {
		Reporter.log("running test method",true);
		String expResult = "quantum academy";
		String actResult = "quantum";
		
		Assert.assertEquals(actResult, expResult, "act and exp results are not equal");
	}*/
	
	//2. assertNotEquals
	/*@Test
	public void test() {
		Reporter.log("running test method",true);
		String expResult = "quantum academy";
		String actResult = "quantum";
		
		Assert.assertNotEquals(actResult, expResult, "act and exp result is same");
	}*/
	
	//3. assertTrue
	/*@Test
	public void test() {
		boolean result = true;
		
		Assert.assertTrue(result, "result is false");
	}*/
	
	//4. assertFalse
	/*@Test
	public void test() {
		boolean result = true;
		
		Assert.assertFalse(result, "result is true");	
	}*/
	
	//5. assertNull
	/*@Test
	public void test() {
		String result = null;
		
		Assert.assertNull(result, "result is not null");		
	}*/
	
	//6. assertNotNull
	@Test
	public void test() {
		String result = "Quantum Academy";
		
		Assert.assertNotNull(result, "result is null");
	}
	
	//7. fail
	@Test
	public void test1() {
		Reporter.log("running test1 method", true);
		
		Assert.fail();
	}
}
