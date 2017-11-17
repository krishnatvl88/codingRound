package pageObjectLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import GenericLib.Driver;

public class HotelBook {
	 @FindBy(linkText = "Hotels")
	    private WebElement hotelLink;

	    @FindBy(id = "Tags")
	    private WebElement localityTextBox;

	    @FindBy(id = "SearchHotelsButton")
	    private WebElement searchButton;

	    @FindBy(id = "travellersOnhome")
	    private WebElement travellerSelection;
	    
	    public void searchHotels(){
	    	Driver.driver.get("https://www.cleartrip.com/");
	    	
	    	hotelLink.click();

	        localityTextBox.sendKeys("Indiranagar, Bangalore");
	        
	        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
	        searchButton.click();
	    }
}