package com.orangehrmlive.pages;



import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonUtils {

    @FindBy(className = "form_input")
    public WebElement username;

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement password;

    @FindBy(className = "btn_action")
    public WebElement loginButton;

    @FindBy()
    public WebElement verify_home_page;

    public void enterUserName(String uname){
        username.sendKeys(uname);
    }

    public void enterUserPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickOnLoginButton()
    {
        loginButton.click();
    }

    public void currentPage()
    {

    }


    public LoginPage()
    {

        PageFactory.initElements(driver, this);
    }


}
