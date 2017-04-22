package HomeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 18/03/2017.
 */
public class $2Guru99 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys("lotua7143@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//        WebDriver driver1 = new FirefoxDriver();
        driver.get("http://demo.guru99.com/v4/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr70701");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("YzYtUge");
        driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
        String exceptedResult = "Guru99 Bank";
        String actualtxt=driver.findElement(By.className("barone")).getText();
        Assert.assertEquals(exceptedResult, actualtxt);
    }
}
