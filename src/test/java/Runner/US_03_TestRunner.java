package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_3_Aynur.feature"},
        glue={"StepDefinitions"}
)

public class US_03_TestRunner extends AbstractTestNGCucumberTests {
}
