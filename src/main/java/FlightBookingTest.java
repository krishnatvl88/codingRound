import GenericLib.Driver;
import pageObjectLib.FlightBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FlightBookingTest {
	//driver initiation
	public static WebDriver driver;
	
	//FlightBook reference declaration
	FlightBook flightBookPage;


    @Test
    public void testThatResultsAppearForAOneWayJourney() {
    	
    	//browser call
    	driver = Driver.setBrowser();
    	
    	//pagefactory initiation
    	flightBookPage = PageFactory.initElements(driver, FlightBook.class);
    	
        
    	driver.get("https://www.cleartrip.com/");
    	flightBookPage.bookFlight();
    }
}
