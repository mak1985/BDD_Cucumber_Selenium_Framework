package com.orangehrmlive.pages;

import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.support.PageFactory;

public class FinishPage extends CommonUtils {

    public FinishPage()
    {

        PageFactory.initElements(driver, this);
    }

}
