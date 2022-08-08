package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(2000);
		
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);//CDwindow-AB1B45C25C499FBA0B9D53E61811A9D4
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(ids);
		System.out.println(al.get(0));//id of main page
		System.out.println(al.get(1));//id of child page - CDwindow-CA75C3BD70DDECAEE2DF75C4A1ACF0AE
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
