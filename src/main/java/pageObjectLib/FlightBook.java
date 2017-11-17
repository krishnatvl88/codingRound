package pageObjectLib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GenericLib.Driver;
import GenericLib.WebDriverCommonLib;

public class FlightBook extends WebDriverCommonLib{
	@FindBy(id = "OneWay")
    private WebElement oneWay;
	
	@FindBy(id = "FromTag")
    private WebElement fromTag;
	
	@FindBy(id = "ui-id-1")
    private WebElement originOptions;
	
	@FindBy(id = "ui-id-2")
	private WebElement destinationOptions;
	
	@FindBy(id = "ToTag")
    private WebElement toTag;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
    private WebElement departDate;
	
	@FindBy(id = "SearchBtn")
    private WebElement searchBtn;
	
	public void bookFlight(){
		Driver.driver.get("https://www.cleartrip.com/");
		waitFor(2000);
		oneWay.click();
		fromTag.clear();
		fromTag.sendKeys("Bangalore");
		waitFor(2000);
		List<WebElement> orgOptions = originOptions.findElements(By.tagName("li"));
		orgOptions.get(0).click();
		toTag.clear();
		toTag.sendKeys("Delhi");
		waitFor(2000);
		List<WebElement> dstOptions = destinationOptions.findElements(By.tagName("li"));
		dstOptions.get(0).click();
		departDate.click();
		searchBtn.click();
		Assert.assertTrue(isElementPresent(By.className("searchSummary")));
		
		Driver.driver.quit();
	}
}
