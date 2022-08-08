package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	//1. declaration
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SI;
	//WebElement SI=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")); - initialization
	
	//2. Initialization
	public GitHub_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);//@FindBy - findElement
	}
	
	//3.Utilize
	public void clickOnGitHubSignInButton() {
		SI.click();
	}
	
	
}
