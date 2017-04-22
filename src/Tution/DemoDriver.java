package Tution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 18/03/2017.
 */
public class DemoDriver {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("Email")).sendKeys("bhavesh1780");
        driver.findElement(By.cssSelector("input#Email")).sendKeys("bhavesh1780");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).sendKeys("Bhvesh");
        driver.findElement(By.id("signIn")).click();
    }

}
