package DemoNopeCommercePOM;

import org.openqa.selenium.By;

/**
 * Created by Dell on 01/04/2017.
 */
public class LogInPage extends Utils {

    public void login(String username, String password) {
        typeText(By.id("Email"), username);   // enter username
        typeText(By.id("Password"), password);   // enter password
        clickOnElement(By.xpath("//input[@value='Log in']"));       // click on log in button
    }
}
