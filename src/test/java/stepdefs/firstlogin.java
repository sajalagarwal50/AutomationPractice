package stepdefs;

import Pages.loginPage;
import Utilities.WebDriverProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;



public class firstlogin{

    loginPage l= new loginPage(GenericSteps.usersetupsthedriver());

    @Then("user is able to view flights page")
    public void user_is_able_to_view_flights_page() {
        System.out.println("Login");
    }
}
