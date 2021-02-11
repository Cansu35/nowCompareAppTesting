package com.nowcompare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingsPage extends BasePage {

    @FindBy(xpath = "//span[@class='font-bold']")
    public WebElement savingsText;
}
