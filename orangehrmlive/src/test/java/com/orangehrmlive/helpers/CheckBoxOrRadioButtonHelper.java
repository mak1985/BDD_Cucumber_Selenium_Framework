package com.orangehrmlive.helpers;



import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxOrRadioButtonHelper extends CommonUtils {

	public static WebDriver driver;
	
	public CheckBoxOrRadioButtonHelper(WebDriver driver) {
		CheckBoxOrRadioButtonHelper.driver = driver;
		
	}
	
	public boolean isIselected(WebElement element) {
		boolean flag = element.isSelected();
		return flag;
	}
	
	public boolean isIselected(By locator)
	{
		return isIselected(driver.findElement(locator));
	}
	
	
}
