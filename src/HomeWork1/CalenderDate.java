package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 29/03/2017.
 */
public class CalenderDate {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://ticket.southernrailway.com");
        //applied implicitLy wait of 10 seconds to the driver instance - so this will apllied to actual driver instance till it is alive in the script
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("London Terminals");
        driver.findElement(By.xpath("//input[contains(@title,'destination')]")).sendKeys("Heathrow Term 4");
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-box')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'rw-btn-right rw-btn')]")).click();

        By calenderXpath = By.xpath("//td[not(contains(@class,'rw-btn'))]/a[text()='"+ 5 + "']");
        driver.findElement(calenderXpath).click();

//        WebElement dateWeight = driver.findElement(By.id("datepicker"));
//        List<WebElement> colums = dateWeight.findElements(By.tagName("td"));

    }

}
