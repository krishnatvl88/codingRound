package pageObjectLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GenericLib.Driver;
import GenericLib.WebDriverCommonLib;

public class SignIn extends WebDriverCommonLib{
	
	@FindBy(linkText="Your trips")
    private WebElement trip;
	
	@FindBy(id = "SignIn")
    private WebElement signIn;
	
	@FindBy(id = "signInButton")
    private WebElement signInBtn;
	
	@FindBy(id = "errors1")
    private WebElement messageStat;
	
	public void checkSingIn(){
		trip.click();
		signIn.click();
		waitFor(2000);
		Driver.driver.switchTo().frame("modal_window");
		signInBtn.click();
		waitFor(2000);
		String errors1 = messageStat.getText();
		Assert.assertTrue(errors1.contains("There were errors in your submission"));
	}

}
