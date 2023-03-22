package Step_Definitions;

import Pages.LoginPage;
import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa2.vytrack.com");
    }
    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
loginPage.loginFonction(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        loginPage.loginFonction(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));
    }


    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        loginPage.loginFonction(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
      BrowserUtils.waitForPageToLoad(20000);
String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);

    }


}
