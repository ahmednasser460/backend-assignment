package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = {"src/test/features/Scenarios.feature"},
        glue = {"stepdefinition"},
        tags = "@BackEnd_Assignment",
        publish = true,
        dryRun = false,
        monochrome = true

)
public class TestRunner {
}