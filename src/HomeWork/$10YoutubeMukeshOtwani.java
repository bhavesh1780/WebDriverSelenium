package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 19/03/2017.
 */
public class $10YoutubeMukeshOtwani {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("yt-masthead-content")).click();
        System.out.println("test");
        driver.findElement(By.xpath("//input[contains(@id,'masthead-search-term')]")).sendKeys("how to take screenshot for failed test case with webdriver");
        System.out.println("hello");
        driver.findElement(By.xpath("//button[contains(@id,'search-btn')]")).click();
        System.out.println("Finish");
        String checktext = driver.findElement(By.xpath("//div[contains(@class,\'yt-lockup yt-lockup-tile yt-lockup-video clearfix\')]")).getText();
        if (checktext.contains("Mukesh otwani"))
            driver.findElement(By.xpath("//div[contains(@class,'yt-lockup yt-lockup-tile yt-lockup-video clearfix')]")).click();
    }
}
