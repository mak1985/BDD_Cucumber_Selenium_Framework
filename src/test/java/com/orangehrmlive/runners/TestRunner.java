package com.orangehrmlive.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/LeaveRequest.feature",
        glue = "com/orangehrmlive/stepdefinition",
        dryRun = false, //If true then check if all steps are mapped with feature or not //If false then try to execute the test class
        tags = "",
        monochrome = false,
        plugin = {
                "pretty",
                "html:target/cucumber-default-report",
                "json:target/cucumber.json",
                "rerun:target/failed.txt"
        }

)
public class TestRunner {

}
