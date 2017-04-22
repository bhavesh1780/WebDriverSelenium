package HomeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 19/03/2017.
 */
public class $6Electronic {

    public static double convertString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        String resultstring = sb.toString();
        double convertedValue = Double.parseDouble(resultstring);
        System.out.println(convertedValue);
        return convertedValue;
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Date date = new Date();
        SimpleDateFormat x = new SimpleDateFormat("ddmmyyhmmss");
        String y = x.format(date);
        String email = "lotus7143"+y+"@gmail.com";
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys("A12345");
        driver.findElement(By.xpath("//div[@class='buttons']/input")).click();
        driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Tulip");
        driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("ABC");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("A12345");
        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("A12345");
        driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();

        //Click on Electronics
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]")).click();

        //Click on Cell Phone
        driver.findElement(By.xpath("//div[@class='listbox']/ul/li[2]/ul/li[2]/a")).click();

       //adding the 1st cellphone product into cart
        driver.findElement(By.xpath("//div[@class='item-grid']/div[1]/div/div[2]/div[3]/div[2]/input")).click();

        //storing the price for 1st cellphone product
        String price1 = driver.findElement(By.xpath("//div[@class='item-grid']/div[1]/div/div[2]/div[3]/div")).getText();

        //convertString(price1);
        // Removing $ sign from the String price with the help of StringBuilder class of java by using its in build function .deleteCharAt()
        StringBuilder sb1 = new StringBuilder(price1);
        sb1.deleteCharAt(0);
        String resultstring1 = sb1.toString();

        // convertitng the String into double
        double converted_price1 = Double.parseDouble(resultstring1);
        System.out.println("The product_01 price = "+ converted_price1);

        // closing the green notification bar from top
        driver.findElement(By.xpath("//body/div[5]/span")).click();

        //waiting for page to refresh and load after adding one product into basket
        Thread.sleep(3000);

        //adding the 2nd cellphone product into cart
        driver.findElement(By.xpath("//div[@class='item-grid']/div[2]/div/div[2]/div[3]/div[2]/input")).click();

        //storing the price for 1st cellphone product
        String price2 = driver.findElement(By.xpath("//div[@class='item-grid']/div[2]/div/div[2]/div[3]/div")).getText();

        //convertString(price2);
        StringBuilder sb2 = new StringBuilder(price2);
        sb2.deleteCharAt(0);
        String resultstring2 = sb2.toString();
        double converted_price2 = Double.parseDouble(resultstring2);
        System.out.println("The product_02 price = "+ converted_price2);
        driver.findElement(By.xpath("//body/div[5]/span")).click();
        Thread.sleep(3000);

        // added 3rd cell phone product into cart
        driver.findElement(By.xpath("//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input")).click();
        String price3 = driver.findElement(By.xpath("//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div")).getText();

        //convertString(price3);
        StringBuilder sb3 = new StringBuilder(price3);
        sb3.deleteCharAt(0);
        String resultstring3 = sb3.toString();
        double converted_price3 = Double.parseDouble(resultstring3);
        System.out.println("The product_03 price = " + converted_price3);

        // clicking the 'Shopping cart' link from green top notification bar
        driver.findElement(By.linkText("shopping cart")).click();
        String expected = "Shopping cart";
        String actual = driver.findElement(By.className("page-title")).getText();

        // verified if we are on shopping cart page after clicking the link
        Assert.assertEquals(expected, actual);

        // doing total of all converted product prices
        Double expected_total = converted_price1 + converted_price2 + converted_price3;
        System.out.println("The expected total price for the basket = " +expected_total);

        // getting-storing the actual order total price from the webpage
        String actualtotal = driver.findElement(By.className("cart-total-right")).getText();
        System.out.println("The ACTUAL total order price = "+ actualtotal);

        // convert the actual total price into double and remove $ --- so we can compare this with expected-total (from above finding)
        StringBuilder sb = new StringBuilder(actualtotal);
        sb.deleteCharAt(0);
        String resultstring4 = sb.toString();
        double actual_total = Double.parseDouble(resultstring4);

        // verify if the expected and actual toal order price matches with assertTrue() -- if actual!= expected then only the message: " " will be displayed
        Assert.assertTrue("Total price not matched", actual_total==expected_total);


    }
}
