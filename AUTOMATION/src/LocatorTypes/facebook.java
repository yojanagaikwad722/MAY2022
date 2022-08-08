package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.tagName("input")).sendKeys("qa@pune.com");
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("qa@pune.com");
		//driver.findElement(By.name("email")).sendKeys("qa@pune.com");
		//driver.findElement(By.id("email")).sendKeys("123@gmail.com");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.findElement(By.cssSelector("input[autofocus='1']")).sendKeys("qa@pune.com");
	}
}
