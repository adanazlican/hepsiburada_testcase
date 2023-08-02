package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.time.Duration;

public class StepDefinitions {

    @Given("User on the hepsiburada website")
    public void userOnTheHepsiburadaWebsite() {
        Driver.initDriver();
        Driver.getDriver().get("https://www.hepsiburada.com/");
    }

    @When("user navigate login page")
    public void userNavigateLoginPage() {
        WebElement buton1 = Driver.getDriver().findElement(By.id("myAccount"));
        buton1.click();
        WebElement buton2 = Driver.getDriver().findElement(By.id("login"));
        buton2.click();
    }

    @When("user enter correct email")
    public void setEmail(){

        WebElement emailField = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/form/div/div[1]/input"));
        emailField.sendKeys("adanazlican@hotmail.com");
    }

    @And("user click giris yap")
    public void userClickGirisYap() {
        WebElement buton3 = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/form/button"));
        buton3.submit();
    }

    @And("user enter correct password")
    public void userEnterCorrectPassword() throws InterruptedException {
            WebElement passwordField = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/form/div/div/input"));
            passwordField.sendKeys("A2bcdefg");
            Thread.sleep(Duration.ofSeconds(5));

    }

    @Then("user click gy again")
    public void userClickGyAgain() {
        //WebElement buton4 = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/form/button"));
        //buton4.submit();
        //WebElement buton5 = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/form/button"));
        //buton5.submit();
        WebElement passwordLogin = Driver.getDriver().findElement(By.id("btnEmailSelect"));
        System.out.println("element bulundu");
        passwordLogin.submit();
        System.out.println("giriş yap click");
    }
}
