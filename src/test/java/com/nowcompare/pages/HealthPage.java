package com.nowcompare.pages;

import com.nowcompare.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class HealthPage extends BasePage{

    @FindBy(css = "input[type='submit']")
    public WebElement getQuotesButton;

    @FindBy(tagName = "select")
    public WebElement firstDropDown;

    @FindBy(css = "select[type='text'][name='fLocation']")
    public WebElement locationDropdown;

    @FindBy(xpath = "//div[contains(text(),'Select your')]")
    public WebElement requirements;

    public void chooseOptionNumber(int index){
        Select select = new Select(firstDropDown);
        select.selectByIndex(index);
    }

    public void chooseOptionLocation(String text){
        Select select = new Select(locationDropdown);
        select.selectByVisibleText(text);
    }

    public void chooseRandomlyCheckBox(){
        int number =new Random().nextInt(3)+3;

        Driver.get().findElement(By.xpath("(//input[@type='checkbox'])["+number+"]")).click();


    }


}
