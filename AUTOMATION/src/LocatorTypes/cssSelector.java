package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///E:/Yojana/new/May2022/HTML/Locators.html");
		
		//7. cssSelector
		//driver.findElement(By.cssSelector("input[type='submit']")).click();//SignUp
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
