package stepdefs;

import Interfaces.Login;
import Pages.loginPage;
import Utilities.WebDriverProvider;
import Utilities.configProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class GenericSteps{

    Login loginpage= new loginPage(driver);
    public static WebDriver driver= null;

    @Given("user setups the driver")
    public static WebDriver usersetupsthedriver() {
       driver= WebDriverProvider.getDriver();
       return driver;
    }

    @Given("user navigates to webpage")
    public void usernavigatesToHomePage() {
        loginpage.openHomepage();
    }

    @When("user enters the username")
    public void enterUsername() throws InterruptedException {
        //loginpage.clickLogin();
        loginpage.enterUsername(configProvider.config().getString("username"));
    }

    @When("user enters the password")
    public void enterPassword() {
        loginpage.enterPassword(configProvider.config().getString("password"));
    }

    @When("user clicks on continue")
    public void clickOnContinue() {
        loginpage.clickOnContinue();
    }
    @When("user log in the application")
    public void login() {
        loginpage.clickOnLogin();
    }
}