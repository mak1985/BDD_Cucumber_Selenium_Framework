package com.orangehrmlive.stepdefinition;

import com.orangehrmlive.utils.CommonUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SwaglabE2ETest extends CommonUtils {

    @Given("User is on swaglabs url")
    public void user_is_on_swaglabs_url() {
        Assert.assertEquals(getPageTitle(), "Swag Labs");
    }
    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String uname, String pwd) {
    loginPage.enterUserName(uname);
    loginPage.enterUserPassword(pwd);
    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
    loginPage.clickOnLoginButton();
    }
    @Then("User should able to navigate to Products screen")
    public void user_should_able_to_navigate_to_products_screen() {
    productPage.verifyProductsScreen();
    }
    @When("User selects product from the list {string}")
    public void user_selects_product_from_the_list(String list) throws InterruptedException {

        for (WebElement item : productPage.items_list )
        {
            if(item.getText().equals(list))
            {
                click(item);
                break;
            }
        }
        Thread.sleep(5000);
    }
    @When("User clicks ADD TO CARD button")
    public void user_clicks_add_to_card_button() {
    productPage.clickAddToCardButton();
    }
    @Then("Selected product should be added to the card")
    public void selected_product_should_be_added_to_the_card() {

    }
    @When("User clicks on card icon")
    public void user_clicks_on_card_icon() {

    }
    @Then("User should navigate to Your Cart page")
    public void user_should_navigate_to_your_cart_page() {

    }
    @When("User clicks on checkout button")
    public void user_clicks_on_checkout_button() {

    }
    @Then("User should navigate to Checkout: Your Information page")
    public void user_should_navigate_to_checkout_your_information_page() {

    }
    @When("User enters first name as {string}")
    public void user_enters_first_name_as(String string) {

    }
    @When("User enters last name as {string}")
    public void user_enters_last_name_as(String string) {

    }
    @When("User enters zip or postal code as {string}")
    public void user_enters_zip_or_postal_code_as(String string) {

    }
    @When("User clicks Continue button")
    public void user_clicks_continue_button() {

    }
    @Then("User should navigate to Checkout: Overview page")
    public void user_should_navigate_to_checkout_overview_page() {

    }
    @When("User clicks on Finish button")
    public void user_clicks_on_finish_button() {

    }
    @Then("User should navigate to Finish page")
    public void user_should_navigate_to_finish_page() {

    }
    @Then("User should see messages as {string}")
    public void user_should_see_messages_as(String string) {

    }
    @Then("Your order has been dispatched, and will arrive just as fast as the pony can get there!")
    public void your_order_has_been_dispatched_and_will_arrive_just_as_fast_as_the_pony_can_get_there() {

    }
}
