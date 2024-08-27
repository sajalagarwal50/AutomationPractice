package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage extends Base {

    public WebDriverWait wait= null;

    public WebDriver driver= null;

    public BasePage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public void handleDynamicPopup(List<WebElement> element, WebElement handleppop) {
        waitForVisibilityOfElement(handleppop,30);
        if (element.size() > 0) {
            handleppop.click();
        }
    }

    public void waitForVisibilityOfElement(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForVisibilityOfElement(WebElement element, int time){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeClickable(WebElement element, int time){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickOnElement(WebElement element){
        waitForElementToBeClickable(element);
        element.click();
    }

    public void clickUsingJavaScriptExecutor(WebElement element){
        waitForElementToBeClickable(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void enterText(WebElement element, String text) {
        waitForVisibilityOfElement(element);
        element.sendKeys(text);
    }

    public void hardwait(int time) throws InterruptedException {
        Thread.sleep(time);
    }


}