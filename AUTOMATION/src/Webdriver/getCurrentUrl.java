package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) {
		String expUrl="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//6. maximize
		driver.manage().window().maximize();
		
		//5. getCurrentUrl
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);
		
		if(expUrl.equals(actUrl)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		//7. minimize
		driver.manage().window().minimize();
		
		//driver.quit();
	}
}
