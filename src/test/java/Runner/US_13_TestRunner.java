package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_13_Zeynep.feature"},
        glue={"StepDefinitions"}
)
public class US_13_TestRunner extends AbstractTestNGCucumberTests {
}
