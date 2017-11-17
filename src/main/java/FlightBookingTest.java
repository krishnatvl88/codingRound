import GenericLib.Driver;
import pageObjectLib.FlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlightBookingTest {
	//driver initiation
	public static WebDriver driver;
	
	//FlightBook reference declaration
	FlightBook flightBookPage;

	@BeforeClass
	public void configBeforClass(){
		//browser call
		driver = Driver.setBrowser();
		
		//pagefactory initiation
		flightBookPage = PageFactory.initElements(driver, FlightBook.class);
		
	}

    @Test
    public void testThatResultsAppearForAOneWayJourney() {
 
    	driver.get("https://www.cleartrip.com/");
    	flightBookPage.bookFlight();
    }
    
    @AfterClass
	public void configAfterClass(){
    	driver.quit();
    }
}
