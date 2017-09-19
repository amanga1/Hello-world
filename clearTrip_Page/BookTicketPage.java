package clearTrip_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookTicketPage {
	private WebDriver driver;
	
	public BookTicketPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void bookMyTicket() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[@type='submit' and @class='booking' ]")).click();
		//button[@type='submit' and @class='booking' ]
	}
	
	
	
	

}
