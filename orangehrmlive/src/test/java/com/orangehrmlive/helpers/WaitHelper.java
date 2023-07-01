package com.orangehrmlive.helpers;




import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WaitHelper extends CommonUtils {
	
	public static WebDriver driver;
	
	public WaitHelper(WebDriver driver) {
		super();
		WaitHelper.driver = driver;	
	}
	
	public void hardWait(int timeOutInMiliSec) throws InterruptedException {
		Thread.sleep(timeOutInMiliSec);
	}
	
	public WebElement handleStaleElement(By locator,int retryCount,int delayInSeconds) throws InterruptedException {
		
		WebElement element = null;
		
		while (retryCount >= 0) {
			try {
				element = driver.findElement(locator);
				return element;
			} catch (StaleElementReferenceException e) {
				hardWait(delayInSeconds);
				retryCount--;
			}
		}
		throw new StaleElementReferenceException("Element cannot be recovered");
	}
}
