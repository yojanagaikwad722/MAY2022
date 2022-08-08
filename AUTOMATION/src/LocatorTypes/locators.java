package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///E:/Yojana/new/May2022/HTML/Locators.html");
		
		//1. tagName
		driver.findElement(By.tagName("input")).sendKeys("qa@pune.com");
		
		//2. id
		driver.findElement(By.id("1234")).sendKeys("qa@123");
		
		//3. className
		driver.findElement(By.className("abcd")).sendKeys("quantum@pune.com");
		
		//4. name
		driver.findElement(By.name("123")).sendKeys("1234567890");
		
		//5. linkText
		//driver.findElement(By.linkText("Link1")).click();
		
		//6. partialLinkText
		driver.findElement(By.partialLinkText("Li")).click();
		
		
		
	}
}
