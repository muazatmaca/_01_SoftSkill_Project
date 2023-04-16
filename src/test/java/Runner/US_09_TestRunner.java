package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_09_Hatice.feature"},
        glue = {"StepDefinitions"}
)
public class US_09_TestRunner extends AbstractTestNGCucumberTests {
}
