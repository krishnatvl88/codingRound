import pageObjectLib.HotelBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import GenericLib.Driver;

public class HotelBookingTest {

	//driver initiation
	public static WebDriver driver;
	
	
	HotelBook hotelBookPage;
	
	@BeforeClass
	public void configBeforClass(){
		//browser call
		driver = Driver.setBrowser();
		
		//pagefactory initiation
		hotelBookPage = PageFactory.initElements(driver, HotelBook.class);
	}
	
	
    @Test
    public void shouldBeAbleToSearchForHotels() {

    	driver.get("https://www.cleartrip.com/");
    	hotelBookPage.searchHotels();
        
    }
    
    @AfterClass
   	public void configAfterClass(){
       	driver.quit();
    }
}
