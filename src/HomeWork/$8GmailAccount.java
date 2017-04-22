package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 22/03/2017.
 */
public class $8GmailAccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        // This will open a gmail site
        driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
        //applied implicitLy wait of 10 seconds to the driver instance - so this will apllied to actual driver instance till it is alive in the script
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("hello");
        //Filling Personel Data to fill the form
        driver.findElement(By.id("FirstName")).sendKeys("Scott");
        driver.findElement(By.id("LastName")).sendKeys("Cane");
        driver.findElement(By.id("GmailAddress")).sendKeys("scott.cane14");
        driver.findElement(By.id("Passwd")).sendKeys("Testing1234");
        driver.findElement(By.id("PasswdAgain")).sendKeys("Testing1234");
        driver.findElement(By.xpath("//span[@id='BirthMonth']/div")).sendKeys("January");

        driver.findElement(By.id("BirthDay")).sendKeys("2");
        driver.findElement(By.id("BirthYear")).sendKeys("1978");
        driver.findElement(By.xpath("//label[@id='gender-label']/div/div")).sendKeys("Male");
        driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("07885972864");
        driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("lotus7143@gmail.com");
        driver.findElement(By.id("submitbutton")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("tos-scroll-fab-container")).click();

//        This function will scroll down the page(0 is horizontal & 400 is vertical)
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        driver.findElement(By.id("tos-scroll-fab-container")).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        driver.findElement(By.id("iagreebutton")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("verify-phone-input")).sendKeys("856874");
        driver.findElement(By.xpath("//input[@class='g-button g-button-submit']")).click();
        driver.findElement(By.id("submitbutton")).click();
    }
}

