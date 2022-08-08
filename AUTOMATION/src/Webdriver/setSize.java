package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//8. navigate
		driver.navigate().to("https://www.amazon.in/");
		
		//9. setSize
		Dimension d = new Dimension(400, 200);//width-400, height-200
		driver.manage().window().setSize(d);
		
		//10. setPosition
		Point p = new Point(400, 200);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}
}
