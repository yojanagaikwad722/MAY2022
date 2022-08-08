package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		String expTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
				
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//4.getTitle
		String actTitle = driver.getTitle();
		System.out.println(actTitle);//Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in

		if(expTitle.equals(actTitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		driver.quit();
	}
}
