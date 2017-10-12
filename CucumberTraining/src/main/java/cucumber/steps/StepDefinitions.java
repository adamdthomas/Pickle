
package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class StepDefinitions {


	@Given("^this is my first test$")
	public void this_is_my_first_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given - FirstTest");
	}
	
	@When("^I am running my first test$")
	public void i_am_running_my_first_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("When - FirstTest");
	}
	
	@Then("^My test should run$")
	public void my_test_should_run() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	    System.out.println("Then - FirstTest");
	}
	
}
