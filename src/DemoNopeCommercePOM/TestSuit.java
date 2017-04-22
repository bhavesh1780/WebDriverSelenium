package DemoNopeCommercePOM;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Dell on 01/04/2017.
 */
public class TestSuit extends BasePage {

    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    LogInPage logInPage = new LogInPage();
    BookPage bookPage = new BookPage();
    CartPage cartPage = new CartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void userShouldAbleToRegisterSuccessfully(){
        openBrowser();
        homepage.clickOnRegisterButton();
        registrationPage.registerNewUSer();
        Assert.assertEquals("Your registration completed", Utils.getTextFromElement(By.className("result")) );
        closeBrowser();
    }

    @Test
    public void userShouldBeAbleToLogInSuccessfully(){
        openBrowser();
        homepage.clickOnLogInButton();
        logInPage.login("xyz0806171144@gmail.com",  "Patel1");
      //  Assert.assertTrue("User is not logged in", Utils.getTextFromElement(By.linkText("Log out")).contains("Log out"));
        Assert.assertEquals("User is not logged in", Utils.getTextFromElement(By.linkText("Log out")), "Log out");
//        Assert.assertTrue("User is not logged in",Utils.checkIfElementIsDisplayed(By.linkText("Log out")));
        closeBrowser();

    }

    @Test
    public void userShouldLogOutSuccessfully(){
        openBrowser();
        homepage.clickOnLogInButton();
        logInPage.login("xyz0806171144@gmail.com",  "Patel1");
        homepage.clickOnLogOutButton();
        Assert.assertTrue(Utils.checkIfElementIsDisplayed(By.linkText("Log in")));
        closeBrowser();

    }

    @Test
    public void userShouldAbleToAddProductSuccessfully(){
        openBrowser();
        bookPage.clickOnBookPageMenu();
        Assert.assertTrue(Utils.checkIfElementIsDisplayed(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div/h1")));
        closeBrowser();

    }

    @Test
    public void userShouldAbleToPurchaseProductSuccessfullyAsAGuest(){
        openBrowser();
        bookPage.clickOnBookPageMenu();
        cartPage.checkOutShoppingCart();
        cartPage.clickOnCheckOutAsAGuest();
        checkOutPage.checkOutAsAGuest();

    }


}
