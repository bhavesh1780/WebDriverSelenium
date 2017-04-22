package DemoNopeCommercePOM;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Dell on 01/04/2017.
 */
public class Homepage extends Utils {

    public void clickOnRegisterButton(){
        // click on 'Register' button from top menu bar
        clickOnElement(By.xpath("//a[@class=\"ico-register\"]"));
        // Verify if user is navigated to registration page successfully
        Assert.assertEquals("Register", getTextFromElement(By.xpath("//div[@class='page-title']/h1")) );

    }

    public void clickOnLogInButton(){
        // click on login button
        clickOnElement(By.linkText("Log in"));
        // Verify if user is navigated to Log in page successfully
        Assert.assertEquals("Welcome, Please Sign In!", getTextFromElement(By.className("page-title")));
    }

    public void clickOnLogOutButton(){
        // Explicitly waiting for 'log out' button to be clickable
        waitTillElementIsClickable(By.linkText("Log out"), 3);
        //click on logout button
        clickOnElement(By.linkText("Log out"));
        //Verify if user is navigated to Logged Out
        Assert.assertTrue(checkIfElementIsDisplayed(By.linkText("Log in")));
    }

    public void navigateToBookPage(){
        //Click on Book Page
        clickOnElement(By.xpath("//div[@class='header-menu']/ul/li[5]"));
    }
}
