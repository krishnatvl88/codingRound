import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericLib.Driver;
import pageObjectLib.FlightBook;
import pageObjectLib.HotelBook;
import pageObjectLib.SignIn;

public class ClearTripTests {
	
	//driver initiation
	private static WebDriver driver;
			
	SignIn signInPage;
	FlightBook flightBookPage;
	HotelBook hotelBookPage;
	
	@BeforeClass
	public void configBeforClass(){
		//browser call
		driver = Driver.setBrowser();
		signInPage = PageFactory.initElements(driver, SignIn.class);
		flightBookPage = PageFactory.initElements(driver, FlightBook.class);
		hotelBookPage = PageFactory.initElements(driver, HotelBook.class);
	}
	
	@BeforeMethod
	public void configBeforeMtd(){
		driver.get("https://cleartrip.com");
	}
	
	@Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

    	//driver.get();

    	signInPage.checkSingIn();
    }
	
	@Test
    public void testThatResultsAppearForAOneWayJourney() {
 
    	//driver.get("https://www.cleartrip.com/");
    	flightBookPage.bookFlight();
    }
	
	@Test
    public void shouldBeAbleToSearchForHotels() {

    	//driver.get("https://www.cleartrip.com/");
    	hotelBookPage.searchHotels();
        
    }
	
	@AfterClass
	public void configAfterClass(){
    	driver.quit();
    }
	
}
