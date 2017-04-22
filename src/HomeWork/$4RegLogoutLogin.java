package HomeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * WAS to register a user on demo.nopcommerce and logout and login again
 */
public class $4RegLogoutLogin {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Date date = new Date();
        SimpleDateFormat x = new SimpleDateFormat("ddmmyyhmmss");
        String y = x.format(date);
        String email = "lotus7143"+y+"@gmail.com";
        System.out.println(email);
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Tulip");
        driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("ABC");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("A12345");
        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("A12345");
        driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
        driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys("A12345");
        driver.findElement(By.xpath("//input[contains(@class,\"login-button\")]")).click();
//        assertTrue methord used to assert if the logout button is displayed or enable
        Assert.assertTrue("verify logout button failed",driver.findElement(By.className("ico-logout")).isEnabled());
//        System.out.println("Test Pass");

    }
}
