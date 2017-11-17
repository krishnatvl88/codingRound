package GenericLib;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class WebDriverCommonLib {
	
	protected void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


	protected boolean isElementPresent(By by) {
	    try {
	    	Driver.driver.findElement(by);
	        return true;
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
}
