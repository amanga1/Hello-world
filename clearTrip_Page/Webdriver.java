package clearTrip_Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {
	
	public WebDriver driver;

	
	public WebDriver readExcel() throws IOException
	{
		
	File file = new File("E:\\selenium\\security\\datasheet.xlsx");
	FileInputStream fs = new FileInputStream(file);
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sh = wb.getSheet("readfromsheet");
	String browser = sh.getRow(0).getCell(1).getStringCellValue();
	SelectBrowser(browser);
	return driver;
		}
	

	private void SelectBrowser(String browserType) {
		
		if(browserType.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if (browserType.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C://chrome//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		
	}

}
