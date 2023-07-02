package com.orangehrmlive.testbase;


import com.orangehrmlive.pages.*;

public class PageInitializer extends BaseClass {
    public static LoginPage loginPage;
    public static ProductPage productPage;
    public static YourCartPage yourCartPage;
    public static CheckoutOverviewPage checkoutOverviewPage;
    public static CheckoutYourInformationPage checkoutYourInformationPage;
    public static FinishPage finishPage;
    public static void initialize() {
        // initialize pages
         loginPage = new LoginPage();
        productPage =  new ProductPage();
        yourCartPage = new YourCartPage();
        checkoutOverviewPage = new CheckoutOverviewPage();
        checkoutYourInformationPage = new CheckoutYourInformationPage();
        finishPage = new FinishPage();


    }
}
