package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_8_Aynur.feature"},
        glue={"StepDefinitions"}
)
public class US_8_TestRunner extends AbstractTestNGCucumberTests {
}
