package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {

	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException {
		WebDriver driver = null;
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equals("ie")){
			System.setProperty("webdriver.ie.driver", "ie.exe file path");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
