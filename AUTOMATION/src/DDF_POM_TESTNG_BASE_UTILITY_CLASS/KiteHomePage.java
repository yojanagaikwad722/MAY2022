package DDF_POM_TESTNG_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath="//span[@class='user-id']") private WebElement USRID;
	
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyKiteHomePageProfileName() {
		String actResult = USRID.getText();
		return actResult;
	}
	
	public void clickKiteHomePageUserId() {
		USRID.click();
	}
}
