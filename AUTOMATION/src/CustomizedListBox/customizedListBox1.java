package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][2]"));
		
		Actions act = new Actions(driver);//keyboard can interact with browser with the help of actions class
		
		//1. click - used to click on WebElement
		act.click(month).perform();
		
		//2. perform - to execute every actions/method of Actions class we need to use perform() method
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
