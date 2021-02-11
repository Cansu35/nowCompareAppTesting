package com.nowcompare.pages;

import com.nowcompare.utilities.BrowserUtils;
import com.nowcompare.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[3]")
    public WebElement insuranceTab;
    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[4]")
    public WebElement financeTab;
    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[5]")
    public WebElement lifestyleTab;
    @FindBy(css = "div.dropdown-menu.show>a:nth-of-type(1)")
    public WebElement healthBar;
    @FindBy(css = "div.dropdown-menu.show>a:nth-of-type(2)")
    public WebElement lifeBar;
    @FindBy(css = "div.dropdown-menu.show>a:nth-of-type(3)")
    public WebElement employeebenefitsBar;
    @FindBy(css = "div.dropdown-menu.show>a:nth-of-type(1)")
    public WebElement savingsBar;
    @FindBy(css = "div.dropdown-menu.show>a:nth-of-type(2)")
    public WebElement uKpensionTransferBar;
    @FindBy(css = "div.dropdown-menu.show>a:nth-of-type(1)")
    public WebElement jobsBar;
    @FindBy(css = "div.dropdown-menu.show>a:nth-of-type(2)")
    public WebElement wellnessBar;


    public void navigateTo(String tab, String bar) {

        String tabLoc = "//a[normalize-space()='" + tab + "']";
        String barLoc = "//a[normalize-space()='" + bar + "']";

        Driver.get().findElement(By.xpath(tabLoc)).click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath(barLoc)).click();

    }
}


