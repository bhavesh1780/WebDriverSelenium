package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Dell on 31/03/2017.
 */
public class Orange {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        //Opens the web page
        driver.get("https://enterprise-demo.orangehrmlive.com/auth/login");
        //inputs the user name
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //inputs the password
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
        //click on login button
        driver.findElement(By.id("btnLogin")).click();
        //clivk on PIM, hover to add employee and click
        WebElement subMenu = driver.findElement(By.xpath("//div[@class='menu']/ul/li[2]/a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(subMenu).build().perform();
        //click on add employee
        driver.findElement(By.id("menu_pim_addEmployee")).click();
        //fill employee details first name
        driver.findElement(By.id("firstName")).sendKeys("Test");
        //fill Last Name
        driver.findElement(By.id("lastName")).sendKeys("Test");
        //Input Employee ID
        driver.findElement(By.id("employeeId")).clear();
        driver.findElement(By.id("employeeId")).sendKeys("1780");
        //select location by using selection method
        Select select;
        new Select(driver.findElement(By.id("location"))).selectByVisibleText("British Development Center");
        //click on save button
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(2000);
        //edit personal details
        driver.findElement(By.xpath("//input[contains(@value,'Edit')]")).click();
        //fill licence expiry date
        driver.findElement(By.id("personal_txtLicExpDate")).clear();
        driver.findElement(By.id("personal_txtLicExpDate")).sendKeys("2020-12-20");
        Thread.sleep(2000);
        //select Marital status
        new Select(driver.findElement(By.id("personal_cmbMarital"))).selectByVisibleText("Married");
        //input DOB
        driver.findElement(By.id("personal_DOB")).clear();
        driver.findElement(By.id("personal_DOB")).sendKeys("1978-10-20");
        //click on save button
        driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();

    }
}
