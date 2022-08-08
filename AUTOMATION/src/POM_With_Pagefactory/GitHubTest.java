package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\May2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		Thread.sleep(2000);
		
		GitHub_SignIn signIn = new GitHub_SignIn(driver);
		signIn.clickOnGitHubSignInButton();
		
		Thread.sleep(2000);
		
		GitHub_Login login = new GitHub_Login(driver);
		login.setGitHubLoginUsername();
		login.setGitHubLoginPassword();
		login.clickGitHubLoginBtn();
		
		GitHub_HomePage home = new GitHub_HomePage(driver);
		home.clickGitHubHomePageClickBtn();
		Thread.sleep(2000);
		
		home.clickGitHubHomePageSignOutBtn();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
