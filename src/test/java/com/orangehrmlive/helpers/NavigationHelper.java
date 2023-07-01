package com.orangehrmlive.helpers;



import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class NavigationHelper extends CommonUtils {

	public static WebDriver driver;
	
	public NavigationHelper(WebDriver driver) {
		NavigationHelper.driver = driver;
		
	}
	
	public void navigateTo(String url) {
		driver.get(url);
	}

	public void naviagteTo(URL url) {
		driver.get(url.getPath());
	}

	public String getTitle() {
		driver.getTitle();
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		driver.getCurrentUrl();
		return driver.getCurrentUrl();
	}
}
