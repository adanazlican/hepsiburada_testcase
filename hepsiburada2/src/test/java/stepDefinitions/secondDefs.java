package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class secondDefs {
    @Given("user on the main page")
    public void userOnTheMainPage() {
            Driver.initDriver();
        Driver.getDriver().get("https://www.hepsiburada.com/");
    }

    @When("user goes to yurt disindan")
    public void userGoesToYurtDisindan() {
        WebElement yurtdisi = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[5]/div/div/div/div[1]/div[2]/ul/li[3]/a"));
        yurtdisi.click();
    }


    @And("user choose altin taki mucevher")
    public void userChooseAltinTakiMucevher() {
        //WebElement altin = Driver.getDriver().findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div/div[1]/section/div/div[2]/div/div/ol/li[1]/ol/li[1]/label"));
        //altin.click();
        WebElement altin2 = Driver.getDriver().findElement(By.xpath("//*[@id=\"AllCategories.CategoryId\"]/div/div/div/div/div/div[2]/div[9]/div/div[1]/div"));
        altin2.click();

    }

    /*@And("user filter the products with the price range one to fifty")
    public void userFilterTheProductsWithThePriceRangeOneToFifty() {

        WebElement bottom = Driver.getDriver().findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div/div[1]/section/div/div[2]/div/div/ol/li[4]/div/div/div[1]/input"));
        bottom.sendKeys("0");
        WebElement top = Driver.getDriver().findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div/div[1]/section/div/div[2]/div/div/ol/li[4]/div/div/div[1]/input"));
        top.sendKeys("50");
        WebElement ara = Driver.getDriver().findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div/div[1]/section/div/div[2]/div/div/ol/li[4]/div/div/div[4]/button"));
        ara.click();
    }*/
}
