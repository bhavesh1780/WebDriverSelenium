package OrangeHrmPOM;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Dell on 03/04/2017.
 */
public class TestSuit extends BasePage {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AdminPage adminPage = new AdminPage();



    @Test
    public void userShouldAbleToLoginSuccessfully(){
        //this will open a Browser
        openBrowser();
        //login with username and password
        loginPage.login("admin","admin");
        //will assert if user is on welcome page
        Assert.assertTrue(Utils.checkIfElementIsDisplayed(By.id("welcome")));
        //Screenshot of welcome page
        Utils.printScreenShot("C:\\Users\\Dell\\IdeaProjects\\WebDriverSelenium\\src\\Screenshot");
        closeBrowser();
    }

    @Test
    public void userShouldAbleToClickOnLastAdminListElement(){
        //this will open a browser
        openBrowser();
        //login with username and password
        loginPage.login("admin","admin");
        //click on admin button
        homePage.navigateToAdminPage();
        //this will click on last check box on the table
        adminPage.clickOnLastCheckBoxOnTable();

    }
}
