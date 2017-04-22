package OrangeHrmPOM;

import org.openqa.selenium.By;

/**
 * Created by Dell on 03/04/2017.
 */
public class LoginPage extends Utils {

    public void login(String username, String password) {
        // enter username
        typeText(By.id("txtUsername"), username);
        // enter password
        typeText(By.id("txtPassword"), password);
        // click on log in button
        clickOnElement(By.id("btnLogin"));
    }
}
