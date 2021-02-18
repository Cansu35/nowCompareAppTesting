package com.nowcompare.step_definitions;

import com.nowcompare.pages.Dashboard;
import com.nowcompare.utilities.BrowserUtils;
import com.nowcompare.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class CommunicationStepDefs {

    @When("the user click the request call back button")
    public void the_user_click_the_request_call_back_button() {
        new Dashboard().requestCallBackButton.click();
    }

    @Then("the user should get the request call back page")
    public void the_user_should_get_the_request_call_back_page() {
        Assert.assertEquals("verify the url", "https://www.nowcompare'e'.com/request-call-back/", Driver.get().getCurrentUrl());
    }

    @When("the user click on the Call us now button")
    public void the_user_click_on_the_Call_us_now_button() {
        new Dashboard().callUsNowButton.click();
    }

    @Then("verify all {string} has corresponding {string} numbers")
    public void verify_all_has_corresponding_numbers(String city, String phone) {
        String path = "//tbody/tr/td[1][text()='" + city + ":']/../td[2]";
        Assert.assertEquals("verify phone numbers", phone, Driver.get().findElement(By.xpath(path)).getText());
    }

}
