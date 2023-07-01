package com.orangehrmlive.helpers;



import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonHelper extends CommonUtils {

	public static WebDriver driver;
	
	public ButtonHelper(WebDriver driver) {
		ButtonHelper.driver = driver;
		
	}
	
	public void click(By locator) {
		click(driver.findElement(locator));
		
	}
	
}
