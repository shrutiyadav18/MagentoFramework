package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "/Demo/Features" }, glue = { "magentoStepdef" }, plugin = { "pretty",
		"html:target/cucumber-reports/cucumber.html", // Default report
}, dryRun = false, // checks mapping between scenario steps and step definition methods
		monochrome = true, tags = "@Test", // to avoid junk characters in output
		publish = false)

public class TestRunner {

}
