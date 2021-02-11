package com.nowcompare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LifePage extends BasePage {

    @FindBy(xpath = "(//span[@class='font-bold'])[1]")
    public WebElement lifeText;
}
