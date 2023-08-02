package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class searchDefs {
    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        Driver.initDriver();
        Driver.getDriver().get("https://www.hepsiburada.com/");
    }
    @And("user click search box")
    public void userClickSearchBox() {
        Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[5]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div/div/div/div[1]")).click();

    }
    @And("user texts single char")
    public void userTextsSingleChar() {
        /*try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }*/

        Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[5]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div/div/div/div[1]/div[2]/input")).sendKeys("a");

    }

    @Then("user click search button")
    public void userClickSearchButton() {
        WebElement ara = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[5]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div/div/div/div[2]"));
        ara.click();
    }



}
