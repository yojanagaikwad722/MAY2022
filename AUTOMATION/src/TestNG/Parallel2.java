package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {

	@Test
	public void TC2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
