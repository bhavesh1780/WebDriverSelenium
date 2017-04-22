package HomeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 18/03/2017.
 */
public class $1Amazon {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.co.uk");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement subMenu = driver.findElement(By.xpath("//span[@class=\"nav-line-2\"]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(subMenu).build().perform();
        WebElement subMenu1 = driver.findElement(By.xpath("//div[@class=\"nav-template nav-flyout-content nav-tpl-itemList\"]/span[12]/span"));
        Actions builder1 = new Actions(driver);
        builder.moveToElement(subMenu1).build().perform();
        driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[3]/div[12]/div/div/a/span")).click();

//        String actual = driver.findElement(By.xpath("//div[@class='acs-category-tile-header']/a")).getText();
//        System.out.println(actual);
        Assert.assertTrue("verify Digital cameras failed",driver.findElement(By.xpath("//div[@class='acs-category-tile-header']/a")).isEnabled());
    }
}
