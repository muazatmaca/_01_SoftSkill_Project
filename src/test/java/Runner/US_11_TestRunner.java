package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_11_Muaz.feature"},
        glue = {"StepDefinitions"}
)
public class US_11_TestRunner extends AbstractTestNGCucumberTests {
}
