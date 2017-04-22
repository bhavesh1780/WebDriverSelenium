package HomeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 19/03/2017.
 */
public class DateInput {
    public static void main(String[] args) {
        // created instance of the WebDriver
        WebDriver driver = new FirefoxDriver();
        // code for generating random numbers for the range till 50
//        Random rand = new Random();
//        int n = rand.nextInt(50);
        //code for generating the current simple date time stamp
        Date date = new Date();
        SimpleDateFormat x = new SimpleDateFormat("ddMMyyhmmss");
        String y = x.format(date);

        //stored the email with timestamp so everytime script runs, will create unique email and we can reuse this email again whenever needed in the whole script
        String email = "xyz"+y+"@gmail.com";
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
//      To enter DOB from drop down list-used Select inbuilt class of webdriver library-created object which accepts WebElements as parameters
        Select select;
        new Select(driver.findElement(By.name("DateOfBirthDay"))).selectByValue("3");
        new Select(driver.findElement(By.name("DateOfBirthMonth"))).selectByIndex(4);
        new Select(driver.findElement(By.name("DateOfBirthYear"))).selectByVisibleText("1978");
//        Select dropdown = new Select(driver.findElement(By.name("DateOfBirthDay")));
//        dropdown.selectByValue("3");
//        Select dropdown1 = new Select(driver.findElement(By.name("DateOfBirthMonth")));
//        dropdown1.selectByIndex(4);
//        Select dropdown2 = new Select(driver.findElement(By.name("DateOfBirthYear")));
//        dropdown2.selectByVisibleText("1978");
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Patel1");
        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Patel1");
        driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
        String exceptedResult = "Your registration completed";
        // Asserted for successful registration message
        String actualtxt=driver.findElement(By.className("result")).getText();
        Assert.assertEquals(exceptedResult,actualtxt);
    }
}
