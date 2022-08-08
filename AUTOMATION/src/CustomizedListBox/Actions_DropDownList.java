package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DropDownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		//1. moveToElement - used to move to web element(which contains drop down list)
		act.moveToElement(login).perform();
		Thread.sleep(1000);
		
		//2. contextClick -to perform right click
		act.contextClick(login).perform();
		Thread.sleep(2000);
		
		//3. click - to perform left click
		act.click(login).perform();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
