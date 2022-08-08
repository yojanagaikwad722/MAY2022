package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 
		 System.out.println(links.size());
		 
		 for(WebElement l1:links) {
			 System.out.println(l1.getText());
		 }
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
	}
}
