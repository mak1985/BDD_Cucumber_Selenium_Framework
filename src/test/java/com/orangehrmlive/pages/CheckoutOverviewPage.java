package com.orangehrmlive.pages;

import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends CommonUtils {


    public CheckoutOverviewPage()
    {

        PageFactory.initElements(driver, this);
    }
}
