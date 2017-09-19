package clearTrip_Page;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	private WebDriver driver;
	public ScreenShot(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void takescreenshot(String screeensnap) {
		
		File picture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(picture, new File(screeensnap+".jpeg"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		
	}
	
	

}
