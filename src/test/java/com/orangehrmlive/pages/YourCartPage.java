package com.orangehrmlive.pages;

import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage extends CommonUtils {


    public YourCartPage()
    {

        PageFactory.initElements(driver, this);
    }
}
