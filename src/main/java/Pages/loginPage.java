package Pages;

import Interfaces.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;


public class loginPage extends BasePage implements Login  {


    @FindBy(xpath="//li[contains(@class,'userLoggedOut')]")
    public static WebElement loginField;

    @FindBy(xpath="//input[@data-cy='userName']")
    public static WebElement usernameField;

    @FindBy(id="password")
    public static WebElement passwordField;

    @FindBy(xpath="//button[@data-cy='continueBtn']/span")
    public static WebElement continueButton;

    @FindBy(xpath="//button[@data-cy='login']")
    public static WebElement loginButton;

    @FindBys({
            @FindBy(xpath = "//img[@data-cy='signInByMailButton']")
            })
    public static List<WebElement> emailIcon;

    @FindBys({
            @FindBy(xpath = "//section[contains(@class,'modalMain')]")
    })
    public static List<WebElement> loginPopup;

    @FindBy(xpath="//span[@data-cy='closeModal']")
    public static WebElement dismissPopup;
    public WebDriver driver= null;

    public loginPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }


    public void clickLogin() throws InterruptedException {
        handleDynamicPopup(loginPopup,dismissPopup);
        clickOnElement(loginField);
    }
    public void openHomepage(){
        driver.get(System.getenv("url"));
    }
    public void enterUsername(String username){
        if(emailIcon.size()>0)
            emailIcon.get(0).click();
        enterText(usernameField,username);
    }

    public void enterPassword(String password){
        enterText(passwordField,password);
    }

    public void clickOnContinue(){
        clickOnElement(continueButton);
    }

    public void clickOnLogin(){
        clickOnElement(loginButton);
    }

}
