package HomeWork1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 29/03/2017.
 */
public class Very {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.very.co.uk/");

        //applied implicitLy wait of 10 seconds to the driver instance - so this will apllied to actual driver instance till it is alive in the script
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //It will click on Cookies to hide
        driver.findElement(By.id("hideCookieMsg")).click();
        //This will Hower the subMenu
        WebElement subMenu = driver.findElement(By.id("navElectricals"));
        Actions builder = new Actions(driver);
        builder.moveToElement(subMenu).build().perform();
        driver.findElement(By.xpath("//div[@id='menuElectricals']/div[3]/a[5]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@class='facet']/li[2]/a")).click();

        //This function will scroll down the page(0 is horizontal & 400 is vertical)
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        driver.findElement(By.xpath("//li[@id='product-prod1086755786']/div[2]/a")).click();
        Thread.sleep(3000);
        //This function will scroll down the page(0 is horizontal & 400 is vertical)
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
//        Selecting the warranty
        driver.findElement(By.xpath("//div[@id='prod1086755786']/ul/li[3]/div/div[2]/span")).click();
//        Warranty Selected
        driver.findElement(By.xpath("//div[@id='prod1086755786']/ul/li[3]/fieldset/ul/li[2]/label/span/em")).click();
        driver.findElement(By.id("addToBasketButton")).click();
        driver.findElement(By.id("goToBasket")).click();
        driver.findElement(By.id("basketContinueButtonTop")).click();
//          Login Details
        driver.findElement(By.id("loginID")).sendKeys("test+very@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("Admin1234!");
        driver.findElement(By.id("loginPostcode")).sendKeys("HA9 9AT");
        driver.findElement(By.id("existingCustomerSubmitButton")).click();

        driver.findElement(By.id("basketContinueButtonTop")).click();
        Select select;
        new Select(driver.findElement(By.id("propertyType0"))).selectByValue("House");
        Thread.sleep(3000);
        driver.findElement(By.id("deliveryContinueButton")).click();
        String exceptedResult = "Pay in full";
        String actualText = driver.findElement(By.xpath("//div[@class='formHeader']/h2")).getText();
        Assert.assertEquals(exceptedResult,actualText);
        driver.quit();
    }
}