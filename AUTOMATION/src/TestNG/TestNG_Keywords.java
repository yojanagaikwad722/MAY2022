package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {

	/*@Test(invocationCount = 5)
	public void TC1() {
		Reporter.log("running TC1", true);
	}*/
	
	@Test(priority = 1)
	public void TC2() {
		Reporter.log("running TC2", true);
	}
	
	@Test(priority = 1, enabled=false)
	public void TC3() {
		Reporter.log("running TC3", true);
	}
	
	@Test(priority = -4, dependsOnMethods = {"TC5"})
	public void TC4() {
		Reporter.log("running TC4", true);
	}
	
	@Test(timeOut = 4000)
	public void TC5() throws InterruptedException {
		Thread.sleep(5000);
		Reporter.log("running TC5", true);
	}
}
