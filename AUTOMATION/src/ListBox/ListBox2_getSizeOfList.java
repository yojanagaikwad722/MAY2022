package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_getSizeOfList {

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
		
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("size of year listbox:"+size);//size of year listbox:118
		
		//Print all options in listbox using foreach loop
		System.out.println("Print all options in listbox using foreach loop");
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		
		//Print all options in listbox using foreach loop
		System.out.println("Print all options in listbox using for loop");
		for(int i=0; i<=size-1; i++) {
			System.out.println(options.get(i).getText());
		}

		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
