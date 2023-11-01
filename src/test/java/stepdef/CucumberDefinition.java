package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CucumberDefinition {
    @Given("I have a cucumber step")
    public void iHaveACucumberStep() {
        System.out.println("Cucumber step 1");
    }
    @When("I run the test")
    public void iRunTheTest() {
        System.out.println("Running test");
    }

    @Then("it should pass")
    public void itShouldPass() {
        System.out.println("Pass");
    }
}
