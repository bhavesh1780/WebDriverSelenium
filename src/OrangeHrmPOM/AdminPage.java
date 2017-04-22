package OrangeHrmPOM;

import org.openqa.selenium.By;

/**
 * Created by Dell on 03/04/2017.
 */
public class AdminPage extends BasePage  {

    public void clickOnLastCheckBoxOnTable(){
        //Go on OrangeHrm Admin Page to click on next page navigation button
        if (Utils.checkIfElementIsDisplayed(By.xpath("//ul[@class='paging bottom']/li[7]/a"))){
            Utils.clickOnElement(By.xpath("//ul[@class='paging bottom']/li[7]/a"));
        }
        //click on last check box on table
        Utils.clickOnElement(By.xpath("//table[@id='resultTable']/tbody/tr[last()]/td/input"));
    }
}
