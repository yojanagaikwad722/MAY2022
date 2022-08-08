package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Test_Class {

	@Test //@ -> annotation - summary of method
	public void test() {
		//System.out.println("Quantum Academy");
		//Reporter.log("Quantum Academy", false);//message will be displayed in report but not in console
		//Reporter.log("Quantum Academy", true);//message will displayed in report as well as in console
		Reporter.log("Quantum Academy");
		
	}
}
