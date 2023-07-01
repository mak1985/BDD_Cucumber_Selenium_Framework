package com.orangehrmlive.pages;



import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonUtils {

    @FindBy(xpath="//input[@placeholder='Username']")
    public WebElement username;

    @FindBy(xpath="//input[@type=\"password\"]")
    public WebElement password;

    @FindBy(xpath="//button[@type=\"submit\"][text()=' Login ']")
    public WebElement loginButton;

//    public void enterUserName(String uname)
//    {
//        username.sendKeys(uname);
//    }
//
//    public void enterPassword(String pwd)
//    {
//        password.sendKeys(pwd);
//    }


    //dasdasdasdsadas

    public void clickOnLoginButton()
    {
        loginButton.click();
    }

    public LoginPage()
    {

        PageFactory.initElements(driver, this);
    }


}
