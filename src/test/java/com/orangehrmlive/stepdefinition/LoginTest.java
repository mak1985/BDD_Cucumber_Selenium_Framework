package com.orangehrmlive.stepdefinition;


import com.orangehrmlive.utils.CommonUtils;
import com.orangehrmlive.utils.ConfigsReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends CommonUtils {

    @Given("User is on OrangeHRM portal")
    public void user_is_on_orange_hrm_portal() {
        String actual_title = driver.getTitle();
        String expected_title = "OrangeHRM1";
        Assert.assertEquals(expected_title, actual_title);
        //getPageTitle();
    }
    @When("User enters username")
    public void user_enters_username() {
        enterText(loginPage.username, ConfigsReader.getProperty("username"));
    }
    @When("User enters password")
    public void user_enters_password() {
        enterText(loginPage.password, ConfigsReader.getProperty("password"));
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }
    @Then("User should navigate to home page successfully!")
    public void user_should_navigate_to_home_page_successfully() {


    }

}
