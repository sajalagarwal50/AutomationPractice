package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/sajal.agarwal/Documents/AutomationPractice/AutomationPractice/src/test/java/Features"
        ,glue={"stepdefs"},tags = "@sajal"
)


public class testRunner {
}
