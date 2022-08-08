package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {

	@Test
	public void test() {
		String expResult = "quantum academy";
		String actResult = "quantum";
		boolean result = false;
		
		SoftAssert soft = new SoftAssert();
		
		//verification 1:
		soft.assertNotEquals(actResult, expResult,"act and exp result is equal");
		
		//verification 2:
		soft.assertEquals(actResult, expResult, "act and exp result is different");
		
		//verification 3:
		soft.assertTrue(result, "result is false");
		
		soft.assertAll();
		
		//output: java.lang.AssertionError: The following asserts failed:
		//act and exp result is different expected [quantum academy] but found [quantum],
		//result is false expected [true] but found [false]
	}
}
