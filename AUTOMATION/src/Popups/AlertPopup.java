package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("2");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		
		//1. getText()
		System.out.println(alt.getText());//Do you really want to delete this Customer?
		
		//2. accept() - used to click on OK button
		alt.accept();
		
		//3. dismiss() - used to click on Cancel button
		//alt.dismiss();
		
		Alert alt1 = driver.switchTo().alert();
		
		System.out.println(alt1.getText());//Customer Successfully Delete!
		
		alt1.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
