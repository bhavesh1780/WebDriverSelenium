package OrangeHrmPOM;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Dell on 03/04/2017.
 */
public class HomePage extends Utils {

    public void navigateToAdminPage(){
        //this will click on Admin on Home Page
        clickOnElement(By.id("menu_admin_viewAdminModule"));
        //this will assert if we are on admin page
        Assert.assertTrue(Utils.checkIfElementIsDisplayed(By.xpath("//div[@id='systemUser-information']/a")));
    }
}
