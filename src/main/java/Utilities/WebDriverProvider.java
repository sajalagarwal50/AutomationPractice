package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class WebDriverProvider {
    public static WebDriver driver=null;

    public static WebDriver getDriver(){
        if(System.getenv("browserName").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
//            ChromeOptions options= new ChromeOptions();
//            options.setBinary("/Users/sajal.agarwal/Downloads/chrome-mac-x64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
//            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver();
        }
        else if(System.getenv("browserName").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(System.getenv("browserName").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }
}
