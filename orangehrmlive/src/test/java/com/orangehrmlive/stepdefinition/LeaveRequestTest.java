package com.orangehrmlive.stepdefinition;

import com.orangehrmlive.utils.CommonUtils;
import com.orangehrmlive.utils.ConfigsReader;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.time.Duration;

public class LeaveRequestTest extends CommonUtils {

    @Given("User is on Orange HRM Dashboard page")
    public void user_is_on_orange_hrm_dashboard_page() {
        String actual_title = driver.getTitle();
        String expected_title = "OrangeHRM";
        Assert.assertEquals(expected_title, actual_title);
        enterText(loginPage.username, ConfigsReader.getProperty("username"));
        enterText(loginPage.password, ConfigsReader.getProperty("password"));
        click(loginPage.loginButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    }
    @When("User clicks on Leave tab in menu")
    public void user_clicks_on_leave_tab_in_menu() throws InterruptedException {
        leaveRequestPage.clickOnLeaveTab();
        Thread.sleep(5000);
    }
    @Then("User navigate to leave list tab on leave page")
    public void user_navigate_to_leave_list_tab_on_leave_page() {

    }
    @When("User select {string} and {string} date in calendar")
    public void user_select_and_date_in_calendar(String string, String string2) throws InterruptedException {
        Thread.sleep(10000);
    }
    @When("User selects any {string} from leave with status dropdown")
    public void user_selects_any_from_leave_with_status_dropdown(String string) throws InterruptedException {
        leaveRequestPage.selectShowLeavewithStatus(string);



        Thread.sleep(10000);
    }
    @When("User selects any {string} from leave type dropdown")
    public void user_selects_any_from_leave_type_dropdown(String string) {

    }
    @When("User enters {string} in employee name textbox")
    public void user_enters_in_employee_name_textbox(String string) {

    }
    @When("User selects any {string} from sub-unit dropdown")
    public void user_selects_any_from_sub_unit_dropdown(String string) {

    }
    @When("User enable the past employee toggle")
    public void user_enable_the_past_employee_toggle() {

    }
    @When("click on search button")
    public void click_on_search_button() {

    }
    @Then("user should able to see list of leave request with below details on the same page")
    public void user_should_able_to_see_list_of_leave_request_with_below_details_on_the_same_page() {

    }
}
