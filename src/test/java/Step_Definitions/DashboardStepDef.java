package Step_Definitions;

import Pages.DashboardPage;
import Utilities.BrowserUtils;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardStepDef extends BrowserUtils {

    DashboardPage dashboardPage=new DashboardPage();

    @Then("the title should be Vehicles")
    public void theTitleShouldBeVehicles() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("All"));


    }

    @When("the user navigates to Fleet, Vehicles")
    public void theUserNavigatesToFleetVehicles() throws InterruptedException {
Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());
        WebElement fleetModule1=Driver.getDriver().findElement(By.xpath("//*[text()[normalize-space()='Fleet']]"));

actions.moveToElement(fleetModule1).perform();
        Thread.sleep(3000);
clickFonction(dashboardPage.vechile);
    }
}
