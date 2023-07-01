package com.orangehrmlive.helpers;



import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper extends CommonUtils {

	public static WebDriver driver;
	
	public DropDownHelper(WebDriver driver) {
		super();
		DropDownHelper.driver = driver;
	}
	
	public void SelectUsingVisibleValue(WebElement element,String visibleValue) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleValue);
		
	}
	
	public String getSelectedValue(WebElement element) {
		String value = new Select(element).getFirstSelectedOption().getText();
		return value;
	}
	
	
}
