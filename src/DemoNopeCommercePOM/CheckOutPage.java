package DemoNopeCommercePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Dell on 08/04/2017.
 */
public class CheckOutPage extends Utils {

    public void checkOutAsAGuest(){
        //Type in First Name
        typeText(By.id("BillingNewAddress_FirstName"),"Test");
        //Type in Last Name
        typeText(By.id("BillingNewAddress_LastName"),"AutoTest");
        //Type in Email
        typeText(By.id("BillingNewAddress_Email"),"xyz@gmail.com");
        //Select Country
        new Select(driver.findElement(By.id("BillingNewAddress_CountryId"))).selectByVisibleText("United Kingdom");
        //Select City
        typeText(By.id("BillingNewAddress_City"),"London");
        //Type your Address
        typeText(By.id("BillingNewAddress_Address1"),"123 Any Where");
        //Type your PostalCode
        typeText(By.id("BillingNewAddress_ZipPostalCode"),"HA8 1AH");
        //Input your PhoneNumber
        typeText(By.id("BillingNewAddress_PhoneNumber"),"0788654321");
        //Click on Continue Button
        clickOnElement(By.xpath("//input[contains(@value,'Continue')]"));
    }
}
