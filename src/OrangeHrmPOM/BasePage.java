package OrangeHrmPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 03/04/2017.
 */
public class BasePage {
    //created instance of the WebDriver
    public static WebDriver driver = new FirefoxDriver();


    public static void openBrowser(){
        //link to open browser
        driver.get("https://enterprise-demo.orangehrmlive.com/auth/login");
        //applied implicitly wait of 10 seconds to the driver instance - so this will applied to actual driver instance till it is alive in the script
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximize the window
        driver.manage().window().maximize();
    }
    //this will close current browser
    public static void closeBrowser(){
        driver.quit();
    }
}
