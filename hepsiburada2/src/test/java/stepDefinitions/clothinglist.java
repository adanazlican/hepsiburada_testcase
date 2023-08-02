package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class clothinglist {
    @Given("user on main page")
    public void userOnMainPage() {
        Driver.initDriver();
        Driver.getDriver().get("https://www.hepsiburada.com/");
    }


    @And("user choose fashion")
    public void userChooseFashion() {
        WebElement moda = Driver.getDriver().findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/span[1]"));
        moda.click();
    }


    @And("user choose dresses")
    public void userChooseDresses() {
        WebElement elbise = Driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[2]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"));
    }
}
