package com.nowcompare.pages;

import com.nowcompare.utilities.BrowserUtils;
import com.nowcompare.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//div[@aria-labelledby='navbarDropdown'])[6]/a")
    public List<WebElement> allProductsMenu;

    @FindBy(xpath = "//a[normalize-space()='All Products']")
    public WebElement allProductsButton;


    public void navigateTo(String tab, String bar) {

        String tabLoc = "//a[normalize-space()='" + tab + "']";
        String barLoc = "//a[normalize-space()='" + bar + "']";

        Driver.get().findElement(By.xpath(tabLoc)).click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath(barLoc)).click();

    }

}


