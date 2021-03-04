package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true
        ,features = "src/test/resources/feature/"
        ,plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"}
        ,tags = {"@p2"}
        ,glue = {"cucumber.steps"})
public class RunnerLogin{

}
