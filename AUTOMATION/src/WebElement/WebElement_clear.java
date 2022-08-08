package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		email.sendKeys("qa@pune.com");
		
		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("qa@pune.com");
		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
	
		Thread.sleep(1000);
		
		email.clear();
	
		Thread.sleep(1000);
		
		email.sendKeys("1234@gmail.com");
		
		driver.quit();
	}
}
