package com.orangehrmlive.stepdefinition;


import com.orangehrmlive.utils.CommonUtils;
import com.orangehrmlive.utils.ConfigsReader;
import io.cucumber.java.en.*;
import org.junit.Assert;



public class LoginTest extends CommonUtils {

    @Given("User is on SWAGLABS portal")
    public void user_is_on_swaglabs_portal()
    {
        Assert.assertEquals(getPageTitle(), "Swag Labs");

    }

    @When("User enters username")
    public void user_enters_username()
    {

//        enterText(loginPage.username, ConfigsReader.getProperty("username"));
    }
    @When("User enters password")
    public void user_enters_password()
    {
        enterText(loginPage.password, ConfigsReader.getProperty("password"));
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button()
    {
        click(loginPage.loginButton);
    }
    @Then("User should navigate to home page successfully!")
    public void user_should_navigate_to_home_page_successfully() {


    }

}
