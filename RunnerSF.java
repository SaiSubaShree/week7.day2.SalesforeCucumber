package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import steps.SFBaseNew;
import steps_sales.SFBaseNew;

@CucumberOptions(features="src/test/java/features/salesforce.feature", glue="steps_sales", monochrome= true, publish=true,tags= "@smoke")

public class RunnerSF extends SFBaseNew {
}
