package Pages;

import Interfaces.Login;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage implements Login  {

    @FindBy(xpath="//li[contains(@class,'userLoggedOut')]")
    public static WebElement loginField;


}
