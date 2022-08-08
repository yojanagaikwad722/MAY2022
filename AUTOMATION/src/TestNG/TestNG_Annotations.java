package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	@BeforeClass
	public void openBrowser() {
		//open browser
	}
	
	@BeforeMethod
	public void login() {
		//login
	}
	
	@Test
	public void verifyUsername() {
		//actual test case
	}
	
	@Test
	public void verifyPassword() {
		//actual test case
	}
	
	@AfterMethod
	public void logout() {
		//log out
	}
	
	@AfterClass
	public void closeBrowser() {
		//driver.quit();
	}
}
