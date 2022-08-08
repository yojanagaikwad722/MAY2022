package DDF_POM_TESTNG_BASE_UTILITY_CLASS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass {

	public static String getPropertyFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\url.properties");
		obj.load(objfile);
		String value = obj.getProperty(key);
		return value;
		
	}
	
	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\May2022\\May_Eclipse_Workspace\\AUTOMATION\\TestData\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Kite");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
		
	}
	
	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\Yojana\\new\\May2022\\May_Eclipse_Workspace\\AUTOMATION\\screenshots\\screenshot_"+TCID+".png");
		
		FileHandler.copy(src, dest);
	}
}
