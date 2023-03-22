package Pages;

import Utilities.BrowserUtils;
import Utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BrowserUtils {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement inputUsername;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(id =   "_submit")
    public WebElement loginButton;
public void loginFonction(String userNAme,String password){
    sendKeysFonction(inputUsername,userNAme);

    sendKeysFonction(inputPassword,password);
    clickFonction(loginButton);

}



}
