package com.nowcompare.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.nowcompare.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();


    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "screenshot");
        }

        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDb() {
        System.out.println("\tconnecting to Database...");

    }

    @After("@db")
    public void closeDb() {
        System.out.println("\tdisconnecting from Database...");

    }
}