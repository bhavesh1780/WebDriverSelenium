package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 19/03/2017.
 */
public class $5GiftCard {
    public static void main(String[] args) {
        // created instance of the WebDriver
        WebDriver driver = new FirefoxDriver();
        // code for generating random numbers for the range till 50
        Random rand = new Random();
        int n = rand.nextInt(50);
        //code for generating the current simple date time stamp
        Date date = new Date();
        SimpleDateFormat x = new SimpleDateFormat("ddMMyyhmmss");
        String y = x.format(date);
        //stored the email with timestamp so everytime script runs, will create unique email and we can reuse this email again whenever needed in the whole script
        String email = "xyz" + y + "@gmail.com";
//        System.out.println(n);
        driver.get("http://demo.nopcommerce.com/");
        //maximised the browser window
        driver.manage().window().maximize();
        //applied implitcity wait of 10 seconds to the driver instance - so this will apllied to actual driver instance till it is alive in the script
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Demo");
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Patel1");
        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Patel1");
        driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();
        driver.findElement(By.xpath("//div[@class='item-grid']/div[4]/div/div/div[3]/div[2]")).click();
        driver.findElement(By.id("giftcard_43_RecipientName")).sendKeys("Test");
        driver.findElement(By.id("giftcard_43_RecipientEmail")).sendKeys("lotus7143@gmail.com");
        driver.findElement(By.id("giftcard_43_Message")).sendKeys("Gift from friend");
        driver.findElement(By.xpath("//div[@class='add-to-cart']/div")).click();
        driver.findElement(By.xpath("//body/div[5]/span")).click();
        driver.findElement(By.xpath("//input[@class='button-2 email-a-friend-button']")).click();
//        driver.switchTo().alert().dismiss();
        driver.findElement(By.id("FriendEmail")).sendKeys("lotus7143@gmail.com");
        driver.findElement(By.id("PersonalMessage")).sendKeys("Gift from friend");
        driver.findElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']")).click();
//        Assert.assertTrue("verify Your message sent",driver.findElement(By.className("result"))..isEnabled());
//        System.out.println("Test Pass");
    }
}