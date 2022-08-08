package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		//1. get()- used to open specific url
		//driver.get("amazon");//InvalidArgumentException
		//driver.get("https://amazn.org/");//WebDriverException
		driver.get("https://www.amazon.in/");
		
		//2. close()
		//driver.close();
		
		//3.quit
		driver.quit();
	}
}
