package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_06_Etka.feature"},
        glue={"StepDefinitions"}
)
public class US_06_TestRunner extends AbstractTestNGCucumberTests{

}
