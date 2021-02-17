package com.nowcompare.step_definitions;

import com.nowcompare.utilities.ConfigurationReader;
import com.nowcompare.utilities.Driver;
import io.cucumber.java.en.Given;

public class PreConditionStepDefs {

    @Given("go to the application main page")
    public void go_to_the_application_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
}
