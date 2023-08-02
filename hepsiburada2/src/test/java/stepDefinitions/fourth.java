package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utils.Driver;

public class fourth {
    @Given("users at main page")
    public void usersAtMainPage() {
        Driver.initDriver();
        Driver.getDriver().get("https://www.hepsiburada.com/");
    }


    @And("user navigate to location bar")
    public void userNavigateToLocationBar() {
    }
}
