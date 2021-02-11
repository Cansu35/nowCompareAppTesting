package com.nowcompare.step_definitions;

import com.nowcompare.pages.Dashboard;
import com.nowcompare.pages.LifePage;
import com.nowcompare.pages.SavingsPage;
import com.nowcompare.utilities.BrowserUtils;
import com.nowcompare.utilities.ConfigurationReader;
import com.nowcompare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LifeStepDefs {

    @Given("the user in application dashboard")
    public void the_user_in_application_dashboard() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user go to the Insurance-Life")
    public void the_user_go_to_the_Insurance_Life() {
        new Dashboard().navigateTo("Insurance","Life");

    }

    @Then("verify the page consist of Life Insurance")
    public void verify_the_page_consist_of_Life_Insurance() {
        Assert.assertEquals("Life Insurance", new LifePage().lifeText.getText());
    }

    @When("the user can navigate to {string} and {string}")
    public void the_user_can_navigate_to_and(String tab, String module) {
        new Dashboard().navigateTo(tab,module);
    }

    @Then("verify the page consist of Savings")
    public void verify_the_page_consist_of_Savings() {
        Assert.assertEquals("Savings", new SavingsPage().savingsText.getText());
    }

}
