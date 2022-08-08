package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_sDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		// boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilhimg']")).isDisplayed();
		// System.out.println(result);

		// boolean result =
		// driver.findElement(By.xpath("(//img[@class='national_emblem'])[1]")).isDisplayed();
		// System.out.println(result);//NoSuchElementException

		boolean result;
		try {
			WebElement logo = driver.findElement(By.xpath("(//img[@class='national_emblem'])[1]"));
			result = logo.isDisplayed();//true

		} catch (Exception e) {
			result = false;
		}
		
		System.out.println(result);

		Thread.sleep(2000);
		driver.quit();
	}
}
