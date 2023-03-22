package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   @FindBy(xpath = "//*[text()[normalize-space()='\" + featureText + \"']]")
    public WebElement fleetModule;
    @FindBy(xpath = "//span[@class='title title-level-2'][.='Vehicles']")
    public WebElement vechile;

}
