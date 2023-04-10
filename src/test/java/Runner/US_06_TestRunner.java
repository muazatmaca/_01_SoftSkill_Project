package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_06_US_Etka.feature"},
        glue={"StepDefinitions"}
)
public class US_06_TestRunner extends AbstractTestNGCucumberTests{

}
