package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GenericSteps {
    @Given("user navigates to webpage")
    public void user_navigates_to_homepage() {
        System.out.println("Login");
    }
    @When("user log in the application")
    public void user_log_in_the_application() {
        System.out.println("Login");
    }
}
