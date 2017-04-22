package HomeWork;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 23/03/2017.
 */
public class $9Apparel {
    public static void getscreenshot(WebDriver driver) throws Exception
    {
        Date date = new Date();
        SimpleDateFormat x = new SimpleDateFormat("ddMMyyhmmss");
        String y = x.format(date);

//      It will save multipal screenshot with time stamp
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with name "screenshot.png"
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Dell\\Desktop\\trial\\screenshot"+y+".png"));
    }

    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]")).click();
        driver.findElement(By.xpath("//div[@class='listbox']/ul/li[3]/ul/li[2]/a")).click();
        Select select;
        new Select(driver.findElement(By.id("products-orderby"))).selectByVisibleText("Price: Low to High");
        new Select(driver.findElement(By.id("products-pagesize"))).selectByVisibleText("3");
        driver.findElement(By.xpath("//div[@class='product-viewmode']/a[2]")).click();
        driver.findElement(By.xpath("(//input[@value='Add to compare list'])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@value='Add to compare list'])[3]")).click();
        getscreenshot(driver);
        String expected = " The product has been added to your product comparison";
        Assert.assertTrue("Products not added for comparision", driver.findElement(By.id("bar-notification")).getText().contains(expected));
        driver.findElement(By.xpath("//div[@id='bar-notification']/p/a")).click();
        driver.findElement(By.className("clear-list")).click();
        getscreenshot(driver);


    }
}
