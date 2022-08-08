package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);//C:\Users\DELL\AppData\Local\Temp\screenshot10591729560553564023.png

		String random = RandomString.make(4);
		
		File dest = new File("E:\\Yojana\\new\\JUNE2022\\Screenshots\\facebook"+random+".png");
		
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
