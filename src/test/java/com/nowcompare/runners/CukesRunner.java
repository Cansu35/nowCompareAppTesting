package com.nowcompare.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/nowcompare/step_definitions",
        dryRun = false,
        tags = "@life"
)
public class CukesRunner {

}
