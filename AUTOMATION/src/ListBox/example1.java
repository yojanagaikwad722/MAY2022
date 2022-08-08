package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		//step 1:
		WebElement year = driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][3]"));
		
		//step 2:
		Select s = new Select(year);
		
		//step 3:
		//s.selectByIndex(2);//2020
		
		//s.selectByValue("1945");
		
		s.selectByVisibleText("1998");
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
