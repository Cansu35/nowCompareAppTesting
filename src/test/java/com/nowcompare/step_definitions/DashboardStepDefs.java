package com.nowcompare.step_definitions;

import com.nowcompare.pages.Dashboard;
import com.nowcompare.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DashboardStepDefs {


    @When("the user click on the All Products button")
    public void the_user_click_on_the_All_Products_button() {
        new Dashboard().allProductsButton.click();
    }

    @Then("veriy the menu has following options")
    public void veriy_the_menu_has_following_options(List<String> menuOptions) {
        Assert.assertEquals("verify the menu options",menuOptions, BrowserUtils.getElementsText(new Dashboard().allProductsMenu));
    }

    @Then("verify the menu has following options")
    public void verify_the_menu_has_following_options(List<String> menuOptions) {
        Assert.assertEquals("verify the menu options",menuOptions, BrowserUtils.getElementsText(new Dashboard().allProductsMenu));
    }

}
