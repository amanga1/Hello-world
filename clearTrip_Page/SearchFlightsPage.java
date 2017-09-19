package clearTrip_Page;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFlightsPage {
	
	private WebDriver driver;
	
	
	public SearchFlightsPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void readExcel() {
		// TODO Auto-generated method stub
		
		try
		{
			File filePath = new File("E:\\selenium\\security\\datasheet.xlsx");
			
			FileInputStream fs = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(fs);
				XSSFSheet sh = wb.getSheet("readfromsheet");
				XSSFRow row = sh.getRow(1);
				XSSFCell col = row.getCell(1);
		//		wb.getSheetAt(0).getRow(9).getCell(CellReference.convertColStringToIndex("B"));
				String url = col.getStringCellValue();
				System.out.println(url);
				
				String from = sh.getRow(2).getCell(1).getStringCellValue();
				String to = sh.getRow(3).getCell(1).getStringCellValue();
				String date = sh.getRow(4).getCell(1).getStringCellValue();
				String adult =sh.getRow(5).getCell(1).getStringCellValue();
				String child =sh.getRow(6).getCell(1).getStringCellValue();
			
				filldetails(url,from,to,date,adult,child);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	private void filldetails(String url,String from, String to, String date, String adult,String child) throws InterruptedException {
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.id("FromTag")).sendKeys(from);
		Thread.sleep(15);
		driver.findElement(By.id("ToTag")).sendKeys(to);
		Thread.sleep(15);
		driver.findElement(By.id("DepartDate")).sendKeys(date);
		Thread.sleep(15);
		driver.findElement(By.id("Adults")).sendKeys(adult);
		Thread.sleep(15);
		driver.findElement(By.id("Childrens")).sendKeys(adult);
		Thread.sleep(15);
		driver.findElement(By.id("SearchBtn")).click();
	}
	
	
	
	
	

}
