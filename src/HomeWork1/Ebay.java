package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 29/03/2017.
 */
public class Ebay {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        //Launch browser
        driver.get("http://www.ebay.co.uk/");

        //Maximize window
        driver.manage().window().maximize();

        //applied implicitLy wait of 10 seconds to the driver instance - so this will apllied to actual driver instance till it is alive in the script
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Scrolling the page down by using Javascript
//        ((JavascriptExecutor)driver).executeScript("scroll(0,6500)");
//        //clicking on trending collection
//        driver.findElement(By.xpath("//div[contains(@class,'trending-collections-browse-all-box')]/a")).click();
//        //clicking on all trending
//        driver.findElement(By.xpath("//div[@id='nav-header']/div/div")).click();
//        driver.findElement(By.xpath("//ul[@class='menu']/li[8]/a")).click();

        //Clearing cookies
        driver.findElement(By.id("gh-cookiebanner-close")).click();
        //clicking on shop by category
        driver.findElement(By.id("gh-shop-a")).click();
        //clicking on outdoor toys
        driver.findElement(By.linkText("Outdoor toys")).click();
        //clicking on Bouncy Castles & Inflatables
        driver.findElement(By.linkText("Bouncy Castles & Inflatables")).click();
        //Clicking on Bouncy Castles
        driver.findElement(By.linkText("Bouncy Castles")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//ul[@id='w1-w1']/li[2]/ul/li/div/a/input")).click();
        driver.findElement(By.xpath("//a[span[contains(.,'Fabric')]]")).click();
        driver.findElement(By.xpath("//a[span[contains(.,'New')]]")).click();
//
//
//
//
//
//
//
//
//         List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='w1-w1']/li[2]/ul/li/div/a/input"));
//        System.out.println(Integer.toString(elements.size()));
//        for ( WebElement el : elements ) {
//            if ( !el.isSelected() ) {
//                el.click();
//            }
//        }








//        //Clicking on Material check box
//        driver.findElement(By.id("w_1490857833587_cbx")).click();
//        //Clicking on Condition check box
//        driver.findElement(By.id("id=\"w_1490825174732_cbx\"")).click();
//        //Clicking on Item Location check box
//        driver.findElement(By.linkText("p2376289.m4118.c2")).click();

    }
}
