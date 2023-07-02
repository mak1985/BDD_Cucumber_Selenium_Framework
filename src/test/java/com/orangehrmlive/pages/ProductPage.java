package com.orangehrmlive.pages;

import com.orangehrmlive.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends CommonUtils {

    @FindBy(xpath = "//div[text()='Products']")
    public WebElement verify_Products_Screen;


    @FindBy(xpath = "//div[@class='inventory_item_label']")
    public List <WebElement> items_list;

    @FindBy(css = ".btn_primary")
    public WebElement add_to_card;


    public void verifyProductsScreen(){
        verify_Products_Screen.isDisplayed();
    }

    public void clickAddToCardButton(){
        add_to_card.click();
    }

    public ProductPage()
    {

        PageFactory.initElements(driver, this);
    }
}
