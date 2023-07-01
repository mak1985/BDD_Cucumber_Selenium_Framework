package com.orangehrmlive.pages;

import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveRequestPage extends CommonUtils {

    @FindBy (xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")
    public WebElement clickLeaveTab;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
    public WebElement ShowLeavewithStatus;


    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module'][text()='Leave']")
    public WebElement verifyLeavePageSceen;

    public void clickOnLeaveTab(){
        clickLeaveTab.click();
    }

    public void selectShowLeavewithStatus(String status) throws InterruptedException {
        ShowLeavewithStatus.click();
    }
    public void setVerifyLeavePageSceen(){

    }


    public LeaveRequestPage()
    {

        PageFactory.initElements(driver, this);
    }


}
