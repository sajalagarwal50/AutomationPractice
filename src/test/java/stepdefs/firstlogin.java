package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstlogin {
    @Then("user is able to view flights page")
    public void user_is_able_to_view_flights_page() {
        System.out.println("Login");
    }
}
