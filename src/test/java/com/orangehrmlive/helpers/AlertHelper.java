package com.orangehrmlive.helpers;



import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertHelper extends CommonUtils {

	public static WebDriver driver;
	
	public AlertHelper(WebDriver driver) {
		AlertHelper.driver = driver;
		
	}
	public Alert getAlert() {
		return driver.switchTo().alert();
	}
	public void AcceptAlert() {
		getAlert().accept();
	}
	public void DismissAlert() {
		getAlert().dismiss();
	}
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			// Ignore
			return false;
		}
	}
	public void AcceptAlertIfPresent() {
		if (!isAlertPresent())
			return;
		AcceptAlert();
	}
	public void DismissAlertIfPresent() {

		if (!isAlertPresent())
			return;
		DismissAlert();
	}
public void AcceptPrompt(String text) {
		if (!isAlertPresent())
			return;
		Alert alert = getAlert();
		alert.sendKeys(text);
		alert.accept();
	}
	
}
