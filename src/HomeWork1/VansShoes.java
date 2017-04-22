package HomeWork1;

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
public class VansShoes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.vans.co.uk/");

        //applied implicitLy wait of 10 seconds to the driver instance - so this will apllied to actual driver instance till it is alive in the script
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement subMenu = driver.findElement(By.xpath("//div[@class='lower-container lower-container-js']/ul/li"));
        Actions builder = new Actions(driver);
        builder.moveToElement(subMenu).build().perform();
        driver.findElement(By.xpath("//li[@class='has-dropdown sub-category  not-click mega']/ul/li[5]")).click();
        //click to clear Advertise
        driver.findElement(By.id("close_cta")).click();
        //click to clear cookies policy
        driver.findElement(By.xpath("//span[contains(@class,\"close\")]")).click();

        //This function will scroll down the page(0 is horizontal & 300 is vertical)
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");

        driver.findElement(By.xpath("//picture[contains(@class,\"product-block-views-container\")]")).click();

        //This function will allow to select the size
        Select select;
        new Select(driver.findElement(By.id("attr-size"))).selectByValue("8.5");
        System.out.println("hello");
        Thread.sleep(5000);
        //click on add to cart button
        driver.findElement(By.xpath("//a[contains(text)(),'add to cart')]")).click();
//        WebElement subMenu1 = driver.findElement(By.xpath("//a[contains(text(),'add to cart')]"));
//        Actions builder1 = new Actions(driver);
//        builder.moveToElement(subMenu1).build().perform();
    }
}
