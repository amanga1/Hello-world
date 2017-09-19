package Collection;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {
	
	    public static void main(String[] args) throws IOException {
	    	  System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		    
	        String baseUrl = "http://toolsqa.com/automation-practice-form/";
	        WebDriver driver = new ChromeDriver();  
	        driver.get(baseUrl);
	        
	        WebElement uploadElement = driver.findElement(By.id("photo"));

	        // enter the file path onto the file-selection input field
	        uploadElement.click();

	        
	        Runtime.getRuntime().exec("C:\\Users\\Akash\\Desktop\\Autoit\\fu.exe");
	      
	        }
	}


