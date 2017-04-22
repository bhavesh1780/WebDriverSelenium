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
public class $7Book {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Date date = new Date();
        SimpleDateFormat x = new SimpleDateFormat("ddmmyyhmmss");
        String y = x.format(date);
        String email = "lotus7143"+y+"@gmail.com";
//        System.out.println(email);
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]")).click();
        driver.findElement(By.xpath("//div[@class='item-box']/div[1]/div/h2")).click();
        driver.findElement(By.id("addtocart_37_EnteredQuantity")).clear();
        driver.findElement(By.id("addtocart_37_EnteredQuantity")).sendKeys("4");
        driver.findElement(By.id("add-to-cart-button-37")).click();
        driver.findElement(By.xpath("//body/div[5]/span")).click();
        Assert.assertTrue("Notification not preset",driver.findElement(By.id("bar-notification")).isDisplayed());
        driver.findElement(By.linkText("shopping cart")).click();
        Assert.assertTrue("Shopping cart not present",driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div/h1")).isDisplayed());
        Select select;
        new Select(driver.findElement(By.id("CountryId"))).selectByVisibleText("United Kingdom");
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.xpath("//input[contains(@class,'checkout-as-guest-button')]")).click();
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Test");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("AutoTest");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("xyz@gmail.com");
        new Select(driver.findElement(By.id("BillingNewAddress_CountryId"))).selectByVisibleText("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("123 Any Where");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("HA8 1AH");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0788654321");
        driver.findElement(By.xpath("//input[contains(@value,'Continue')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'shipping-method-next-step-button')]")).click();
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.xpath("//input[contains(@class,'payment-method-next-step-button')]")).click();
        new Select(driver.findElement(By.id("CreditCardType"))).selectByValue("MasterCard");
        driver.findElement(By.id("CardholderName")).sendKeys("Test");
        driver.findElement(By.id("CardNumber")).sendKeys("5190 3670 6278 1788");
        new Select(driver.findElement(By.id("ExpireMonth"))).selectByValue("2");
        new Select(driver.findElement(By.id("ExpireYear"))).selectByValue("2018");
        driver.findElement(By.id("CardCode")).sendKeys("672");
        driver.findElement(By.xpath("//input[contains(@class,'payment-info-next-step-button')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'confirm-order-next-step-button')]")).click();
        String expected = "Your order has been successfully processed!";
        Assert.assertEquals(expected,driver.findElement(By.xpath("//div[@class='page-body checkout-data']/div/div/strong")).getText());
        driver.quit();
    }
}
