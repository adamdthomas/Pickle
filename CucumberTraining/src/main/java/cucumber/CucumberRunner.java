package cucumber;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class) //--Junit
@CucumberOptions
	(plugin = {"pretty", "html:target/html"},
	features = {"src/test/resources/features/"})

//@CucumberOptions(features = {"src/test/resources/features/"}, glue = "cucumber/steps") //extends AbstractTestNGCucumberTests
public class CucumberRunner {

}
