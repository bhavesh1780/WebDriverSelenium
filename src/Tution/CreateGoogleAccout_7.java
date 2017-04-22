package Tution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Lenovo on 20/03/2017.
 */
public class CreateGoogleAccout_7 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //click on create account
        driver.findElement(By.xpath("//div[@class='one-google']/p/span[2]/a")).click();


        //filling all personal detail to create an account
        driver.findElement(By.id("FirstName")).sendKeys("anujbhai");
        driver.findElement(By.id("LastName")).sendKeys("longdon");
        driver.findElement(By.id("GmailAddress")).sendKeys("anuuujbhai");
        driver.findElement(By.id("Passwd")).sendKeys("anuja1234!");
        driver.findElement(By.id("PasswdAgain")).sendKeys("anuja1234!");
        driver.findElement(By.xpath("//span[@id='BirthMonth']/div")).sendKeys("January");
        driver.findElement(By.id("BirthDay")).sendKeys("23");
        driver.findElement(By.id("BirthYear")).sendKeys("1988");
        driver.findElement(By.xpath("//label[@id='gender-label']/div/div")).sendKeys("Male");


        driver.findElement(By.id("submitbutton")).click();
        driver.findElement(By.id("submitbutton")).click();
        driver.findElement(By.xpath("//div[@id='tos-scroll-button']/div/img")).click();
        driver.findElement(By.xpath("//div[@id='tos-scroll-button']/div/img")).click();
        driver.findElement(By.xpath("//div[@id='tos-scroll-button']/div/img")).click();
        driver.findElement(By.xpath("//div[@id='tos-scroll-button']/div/img")).click();
        driver.findElement(By.id("iagreebutton")).click();






    }
}
